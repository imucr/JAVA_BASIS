package sougouZisshuu.sigekiJava.ch16NestedClassNestedInterface.shoppingMallCart;

/*
【ショッピングモールのカートに商品を入れて、その内容を出力】
	・nested classの一種の、inner classの例示。
	
	＊Nested Classの種類
		・static nested class
		・inner class
			・使い先が明確で繰り返される項目を、クラスの内部に別途のクラスとして宣言。
			・使用方法：①inner classインスタンス化　②その中のフィールドやメソッド使用。
		・local inner class		
*/
class NestedClassExample1 {

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addItem("チョコレート", 1, 2000);
		cart.addItem("ケーキ", 5, 3000);
		cart.addItem("シャンペン", 7, 1000000);
		
		printCart(cart);
		
		System.out.printf("%n%s%n%s%n%s%n%n", "　↓", "チョコレートをカートから取り出した後", "　↓");
		cart.removeItem(0);
		printCart(cart);
		
		System.out.printf("%n%s%n%s%n%s%n%n", "　↓", "ケーキの数量変更", "　↓");
		cart.changeItemNumber(0, 2);
		printCart(cart);
	}

	static void printCart(Cart cart) {
		int num = cart.getItemNum();

		System.out.println("　No.　｜　商品名　｜　数量　｜　単価　｜　価格　");
		System.out.println("----------------------------------");
		
		for (int cnt = 0; cnt < num; cnt++) {
			Cart.Item item = cart.getItem(cnt);
			System.out.printf("%3d %5s %5d %7d %7d %n", 
					          cnt+1, item.name, item.num, item.unitPrice, item.getPrice());
				//TODO 出力テーブルの左右のブランクをもっとキレイに調節（format string syntax利用）
		}

		System.out.println("----------------------------------");
		System.out.printf("　　　総計　　　　　　　　　　　　　%10d %n", cart.getTotalPrice());
		
	}

}
