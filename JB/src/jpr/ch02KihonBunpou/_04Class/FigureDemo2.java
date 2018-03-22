package jpr.ch02KihonBunpou._04Class;

/*
Interface：

抽象クラスは親子関係、
interfaceはあくまでも共通機能の定義。
*/
interface GetArea {
  float getArea();
}

class Square4 implements GetArea {

  float width;
  float height;

  Square4(float width, float height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public float getArea() { //MEMO interfaceで定義するメソッドがpublic必須の理由：interfaceはルール。ルールは公開が前提。
    return width * height;
  }
}

class FigureDemo2 {

  public static void main(String[] args) {
    Square4 s = new Square4(5, 6);
    System.out.println("四角形の面積は" + s.getArea() + "です。");
  }
}
