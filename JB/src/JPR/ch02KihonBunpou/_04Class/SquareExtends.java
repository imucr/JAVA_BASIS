package jpr.ch02KihonBunpou._04Class;

/*

super：

	①SuperクラスのConstructor。

	②SubクラスのConstructorが処理される際、
	　SuperクラスにDefault Constructorがあれば自動実行。
	　Default Constructor以外を実行するには、superキーワードで明示的実行。

*/
class Square2_2 {
	float width;
	float height;
	
	Square2_2(float width, float height) {
		this.width = width;
		this.height = height;
	}
	
	float getArea() {
		return this.width * this.height;
	}
}

class Square3 extends Square2_2 {

  Square3(float width, float height) {
    super(width,height);
  }

  @Override
  float getArea(){ //QUESTION Override対象メソッドあると、自動案内出ない理由？
	  return this.width * this.height / 2;
	  
  }
}

public class SquareExtends {

  public static void main(String[] args) {
	  Square3 s3 = new Square3(2, 3);
	  System.out.println("面積：" + s3.getArea());
  }
}
