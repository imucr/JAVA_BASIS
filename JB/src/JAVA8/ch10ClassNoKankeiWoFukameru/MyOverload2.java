package JAVA8.ch10ClassNoKankeiWoFukameru;

//Overload：メソッドの多重定義。パラメータが違うと別のメソッドなので。

	class MyOverload2C {
		void myArea(int r) {
			System.out.println( "円の面積　＝　" + (3.14 * r * r) ); 
		}
		
		void MyArea(int v, int h) {
			System.out.println( "長方形の面積　＝　" + (v * h) ); 
		}
	}
	
	public class MyOverload2 {
	
	  public static void main(String[] args) {
		  MyOverload2C obj = new MyOverload2C();
		  obj.myArea(10);
		  obj.MyArea(20, 40);	  
	  }
}
