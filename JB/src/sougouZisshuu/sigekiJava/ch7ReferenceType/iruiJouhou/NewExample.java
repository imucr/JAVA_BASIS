package sougouZisshuu.sigekiJava.ch7ReferenceType.iruiJouhou;

/*【衣類情報出力】
	・衣類の情報を入れて出力。季節区分のデータとして列挙型利用。
	・「列挙型」の例示
*/
class NewExample {

	public static void main(String[] args) {
		ClothingInfo obj = new ClothingInfo("32919", "半袖シャツ", "綿100%", Season.SUMMER);
		
		System.out.println("商品コード：" + obj.code);
		System.out.println("商品名：" + obj.name);
		System.out.println("素材：" + obj.material);
		System.out.println("季節区分：" + obj.season);
		
	}

}
