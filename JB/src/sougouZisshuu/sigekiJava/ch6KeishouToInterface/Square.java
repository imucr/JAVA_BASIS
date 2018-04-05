package sougouZisshuu.sigekiJava.ch6KeishouToInterface;

/*
【正方形の辺の長さを出力】：コンストラクタ継承の応用の例示
	長方形を継承した正方形クラスに、
	辺の長さの数値を入れて、高さ或いは幅の数値を得る。
*/
class Rectangle {
	private int width, height;
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	int getWidth() {
		return width;
	}
	
	int getHeight() {
		return height;
	}
}

public class Square extends Rectangle {
	Square(int sideLength) {
		super(sideLength, sideLength); //MEMO 親クラスのコンストラクタのパラメータと同じく書かなくていいことが分かる。
	}
	
	int getSideLength() {
		return getWidth(); //MEMO getHeight()でも良い。
	}
	
	public static void main (String[] args) {
		Square sq = new Square(5);
		System.out.println("作られた正方形の辺の長さは" + sq.getSideLength() + "です。");
	}
}
