package JPR.ch02KihonBunpou._04Class;

/*
匿名クラス(＝無名クラス)：
	①宣言と生成を一気に。
	②コードの簡潔化・使い捨てに有用。
*/
interface Idisp {
  void disp();
}

public class AnonymousSample {

  public static void main(String[] args) {
    Idisp obj =
        new Idisp() { //MEMO Interface実装であっても、匿名クラスの場合「implements」記述不要。

          private String msg = "無名クラス";

          @Override
          public void disp() {
            System.out.println(msg);
          }
        };

    obj.disp();
  }
}
