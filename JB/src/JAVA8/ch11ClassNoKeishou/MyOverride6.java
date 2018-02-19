package java8.ch11ClassNoKeishou;

//Override & Return & super

	class MyOrSuper6 {
		double getArea(int r) {
			return 3.14 * r * r;
		}
		
		int getArea(int a, int b) {
			return a * b;
		}
	}
	
	class MyOrSub6 extends MyOrSuper6 {
		double getArea(int r) {
			return 3.14159265 * r *r;
		}
		
		int getArea(int a, int b) {
			return super.getArea(a, b); //MEMO Overridingであっても、Super Classのメソッドの内容をそのまま使う時super便利
		}
	}
	
	public class MyOverride6 {
	
	  public static void main(String[] args) {
		  MyOrSub6 obj = new MyOrSub6();
		  System.out.println( "円の面積　＝　" + obj.getArea(2) );
		  System.out.println( "長方形の面積　＝　" + obj.getArea(4, 5) );
	  }
}
