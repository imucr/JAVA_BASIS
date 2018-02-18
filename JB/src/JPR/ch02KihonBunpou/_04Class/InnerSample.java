package JPR.ch02KihonBunpou._04Class;

/*
内部クラス：
	①クラス間関係明確化
	②処理を外部公開したくない時有用
	③使い捨て目的 cf) 匿名クラス
*/
public class InnerSample {

	class Inner1 {
		public void disp(){
			System.out.println("Inner1クラス"); 
		}
	}
	
	static class StaticInner { //MEMO 内部クラスはフィールドやメソッドと同じように定義可能で、staticをくっつけることができる。
		public void disp(){
			System.out.println("static Innerクラス"); 
		}
	}
	
	public void disp(){
		class Inner2 { //MEMO こうやってメソッドローカルな内部クラスも可能。
			public void disp(){
				System.out.println("Inner2クラス"); 
			}
		}
		
		new Inner2().disp();
	}
	
	
  public static void main(String[] args) {
	  InnerSample is = new InnerSample();
	  is.disp();
	  
	  InnerSample.Inner1 inner = is.new Inner1();
	  inner.disp();
	  
	  new StaticInner().disp();
  }
}
