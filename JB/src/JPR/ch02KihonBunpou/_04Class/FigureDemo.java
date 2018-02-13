package JPR.ch02KihonBunpou._04Class;

//抽象クラス
abstract class Figure {
  abstract float getArea(); //MEMO 格Subクラス間共通メソッド。
}

class Square extends Figure {

  float width;
  float height;

  Square(float width, float height) {
    this.width = width;
    this.height = height;
  }

  @Override
  float getArea() {
    return this.width * this.height;
  }
}

class Circle extends Figure {
	float radius;
	
	Circle(float radius) {
		this.radius = radius;
	}

  @Override
  float getArea() {
    return this.radius * this.radius * 3.14f;
  }
	
	
}

class FigureDemo { //QUESTION ファイル名と同じ名前を持たなければならないクラスの基準は？

  public static void main(String[] args) {
	  Figure fig;
	  
	  fig = new Square(4, 5);
	  System.out.println("四角形の面積" + fig.getArea());
	  
	  fig = new Circle(5); //MEMO ポリモフィズム(多能性)：同じメソッドを、インスタンスだけ入れ替えって使うことができる。
	  System.out.println("円の面積" + fig.getArea());
  }
}
