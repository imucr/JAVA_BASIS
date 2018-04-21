package sougouZisshuu.sigekiJava.ch15ExceptionClass.zaikoKanri;

/*
【在庫増減処理＆数量出力】
	・Exceptionクラスをユーザーが直接宣言する例示。
*/
class StockManagement {

	public static void main(String[] args) {
		GoodsStock gs = new GoodsStock("67890", 3);
		gs.addStock(4);
		
		System.out.println("在庫数量：" + gs.stockNum);
		
		try {
			gs.subtrackStock(10);
		} catch (StockShortageException e) {
			e.printStackTrace();
		} finally {
			System.out.println("在庫数量：" + gs.stockNum);	
		}
		
	}

}
