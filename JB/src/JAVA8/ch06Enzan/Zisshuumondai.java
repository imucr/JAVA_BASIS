package JAVA8.ch06Enzan;

public class Zisshuumondai {
	
	public static void main(String args[]){
		
		//関係演算：オブジェクト比較と文字列比較の区分
			String st1 = "abc";
			String st2 = "ab";
			st2 = st2 + "c";
			
			boolean bn = st1 == st2; //MEMO「==」は、オブジェクト比較用　→　false出力
			System.out.println(bn); 
			
			bn = st2 == "abc";
			System.out.println(bn); //MEMO 同上
			
			bn = st2.equals("abc"); //MEMO Stringクラスの「equals」メソッドは、文字列比較　→　true出力
			System.out.println(bn); 
	}
}