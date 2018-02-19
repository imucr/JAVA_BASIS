package java8.ch11ClassNoKeishou;

//Override & Return

	class MyOrSuper4 {
		double getPi() {
			return 3.14;		
		}
	}
	
	class MyOrSub4 extends MyOrSuper4 {
		double getPi(){
			return 3.14159265;
		}
	}
	
	public class MyOverride4 {
	
	  public static void main(String[] args) {
		  MyOrSub4 obj = new MyOrSub4();
		  System.out.println(obj.getPi());
	  }
	}
