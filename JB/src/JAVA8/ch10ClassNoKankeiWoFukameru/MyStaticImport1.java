package JAVA8.ch10ClassNoKankeiWoFukameru;

//Import：Packageを簡単利用可。Package名を前につけなくて良い。

	import java.lang.Math; //MEMO Mathクラスの場合import省略可。理由後述
	
	public class MyStaticImport1 {
		public static void main(String[] args){
			System.out.println( Math.PI ); 
				/*MEMO 
				  ①staticクラスMathはimport省略可 //QUESTION staticは変数とメソッドにだけつけることできるんじゃなかったか。
			      ②ただし、staticクラスの中のstatic変数PIは前のクラス名省略不可
			    */
		}
}
