package JAVA8.ch11ClassNoKeishou;

//Override：再定義。一番最後のメソッドが適用される。

	class MyOrSuper2 {
		public double pi;
		
		void getPi() {
			pi = 3.14;
		}
	}
	
	class MyOrSub2 extends MyOrSuper2 {
		void getPi() {
			pi = 3.14159265;
		}
	}
	
	public class MyOverride2 {
	
	  public static void main(String[] args) {
		  MyOrSub2 obj = new MyOrSub2();
		  obj.getPi();
		  System.out.println(obj.pi);
	  }
	}
