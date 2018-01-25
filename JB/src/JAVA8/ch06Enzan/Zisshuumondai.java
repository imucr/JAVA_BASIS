package JAVA8.ch06Enzan;

public class Zisshuumondai {
	
	public static void main(String args[]){
		
		//関係演算子「==」：String型で使うとオブジェクト比較で、文字列比較ではない。
			String st1 = "abc";
			String st2 = "ab";
			st2 = st2 + "c";
			
			boolean bn = st1 == st2;
			System.out.println(bn); 
			
			bn = st2 == "abc";
			System.out.println(bn);
			
			bn = st2.equals("abc"); //MEMO Stringクラスの「equals」メソッドは、文字列比較。
			System.out.println(bn); 
	}
}