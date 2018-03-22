package jpr.ch02KihonBunpou._04Class;

/*
Constructor：
	①クラスの初期化に利用。
	②インスタンス作成の際に引数を指定)。
*/
class Square2{
	float width;
	float height;
	
	Square2(float width, float height){ //MEMO パラメータとクラスのメンバと名前同じ可。
		this.width = width;
		this.height = height;
	}
	
	float getArea(){
		return this.width * this.height;
			//MEMO クラスのメンバは名前だけでアクセス可能だが、他の変数と区別するため「this」をつける必要。
			//MEMO this：そのクラス自身のインスタンスを示す。
	}
}

public class SquareConstructor {

  public static void main(String[] args) {
	  Square2 s2 = new Square2(3, 4);
	  System.out.println("面積は" + s2.getArea() + "メートル");
  }
}
