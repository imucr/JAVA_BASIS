package java8.ch12Reigaishori;

//例外処理：除算エラーが発生する場合
	public class Except20a {
	
	  public static void main(String[] args) {
		  try{
			  int i1 = 35;
			  int i2 = 0;
			  
			  int i3 = i1 / i2;
			  System.out.println( "i3 = " + i3 ); 
		  }catch (ArithmeticException errInf) {
			  System.out.println( "errInf = " + errInf ); 
		  }
	  }
	}
