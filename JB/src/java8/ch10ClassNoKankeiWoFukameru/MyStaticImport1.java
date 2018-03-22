package java8.ch10ClassNoKankeiWoFukameru;

//Import：Packageを簡単利用可。Package名を前につけなくて良い。

	import java.lang.Math; //MEMO Mathクラスの場合import省略可。理由後述
	
	public class MyStaticImport1 {
		public static void main(String[] args){
			System.out.println( Math.PI ); 
				/*MEMO 
				  ①staticクラスMathはimport省略可
			      ②ただし、staticクラスの中のstatic変数PIは前のクラス名省略不可(static変数の利用する時の注意点)
			    */
		}
}
