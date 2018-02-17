package JPR.ch02KihonBunpou._07Generics;

/*
Genericsでメソッド定義：
	メソッド単位で汎用処理
	
 */
public class Main {

  public static void main(String[] args) {
	  String str = getT("Hello");
	  System.out.println(str);
	  
	  Integer i = getT(1);
	  System.out.println(i);
  }
  
  private static <T> T getT(T t) {
	  	//MEMO 戻り値の型名を<>の中に記述
	  	//MEMO インスタンスを作らないstaticメソッドにも可能
	  return t;
  }
}
