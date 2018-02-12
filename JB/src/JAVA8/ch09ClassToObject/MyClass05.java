package JAVA8.ch09ClassToObject;

/*
staticメンバ：
	「一つのメモリアドレス」にその値をずっとセーブし続ける。
	クラスを生成する前から確保され、そのままアクセス可能。
	
*/
	class MyClass05b {
	  void method02() {
		MyClass05 obj = new MyClass05();
	    System.out.println( "method02 i = " + MyClass05.i++ ); 
	    		//MEMO static変数は、「クラス名.static変数名」表記。
	    obj.method01();
	  }
	}
	
	
	public class MyClass05 {
	  static int i = 20;
	
	  void method01() {
	    System.out.println( "method01 i = " + i++ );
	  }
	
	  public static void main(String[] args) {
		  MyClass05 obj = new MyClass05();
		  obj.method01();
		  
		  MyClass05b obj2 = new MyClass05b();
		  obj2.method02();
		  
		  System.out.println( "main i = " + MyClass05.i++ ); 
	  }
	}
