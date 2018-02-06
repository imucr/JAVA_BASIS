package JAVA8.ch10ClassNoKankeiWoFukameru;

//Static Import：Static変数名にクラス名を付けずに参照出来るようになる

	import static java.lang.Math.PI;
	
	public class MyStaticImport2 {
	
	  public static void main(String[] args) {
		  System.out.println(PI); //MEMO static import使わないで「Math.PI」使用が望ましい。誤解を招く原因となるので。
	  }
}
