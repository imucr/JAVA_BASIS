package sougouZisshuu.sigekiJava.ch8PackageToAccessShuushokusi.zaikoKanri;

/*
【在庫管理】
	・在庫の追加・削減・数量計算
	・アクセス修飾子、オーバーライド、例外処理の例示
 */
class ConstrExample1 {

	public static void main(String[] args) {
		SmartGoodsStock obj;
		obj = new SmartGoodsStock("52135", 200);
		
		System.out.println("商品コード：" + obj.goodsCode);
		System.out.println("在庫数量" + obj.stockNum);
		
		obj.addStock(1000);
		
		System.out.print("\n" + "↓1000個追加" + "\n\n");
		
		System.out.println("商品コード：" + obj.goodsCode);
		System.out.println("在庫数量：" + obj.stockNum);
		
		try {
			obj.subtractStock(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.print("\n" + "↓100個削減" + "\n\n");

		System.out.print(obj.stockNum + "(減価償却を考慮した本当の数量：" + obj.getRealStockNum() + ")");
	}

}
