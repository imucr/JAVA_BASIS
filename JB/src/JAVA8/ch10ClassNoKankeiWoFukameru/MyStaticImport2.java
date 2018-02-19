package java8.ch10ClassNoKankeiWoFukameru;

//Static Import：Static変数名にクラス名を付けずに参照出来るようになる
	
	public class MyStaticImport2 {
	
	  public static void main(String[] args) {
		  System.out.println(Math.PI);
		  		/* MEMO 
		  		  「import static java.lang.Math.PI;」使って「PI」だけで表現可。
		  		   だが「Math.PI」使用が望ましい。さもないと誤解を招く原因となるので。
		  		 */

	  }
}
