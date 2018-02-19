package jpr.ch02KihonBunpou._04Class;

/*
初期化子：
	①Constructorと同じように起動する処理可能
	②Static初期化子：静的変数初期化に使用。一回だけ。
	③Instance初期化子：Overloadで複数のConstructorが生じた時、それらの共通処理を、一つにまとめて記述可。TODO 当該例示作成
*/
class SuperClass {
	static {
		System.out.println("Superクラス　static初期化子"); 
	}
	
	{
		System.out.println("Superクラス　Instance初期化子"); 
	}
	
	SuperClass() {
		System.out.println("Superクラス　Constructor"); 
	}
	
	void notUsedProof(){
		System.out.println("「The value of ... not used」というEclipse警告文を消すため作ったメソッド"); 
	}
}

class SubClass extends SuperClass {
	static {
		System.out.println("Subクラス　static初期化子"); 
	}
	
	{
		System.out.println("Subクラス　Instance初期化子"); 
	}
	
	SubClass() {
		System.out.println("Subクラス　Constructor"); 
	}
	
}

public class InitializerSample {

  public static void main(String[] args) {
	  System.out.println("１回目");
	  SubClass c1 = new SubClass();
	  c1.notUsedProof();
	  
	  System.out.println("２回目");
	  SubClass c2 = new SubClass();
	  c2.notUsedProof();
  }
}
