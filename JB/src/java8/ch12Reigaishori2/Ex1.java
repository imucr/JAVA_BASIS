package java8.ch12Reigaishori2;

//例外処理(try、catch、finally)
	public class Ex1 {
	
	  public static void main(String[] args) {
		  int i = 0, j = 1;
		  try {
			  j = 10 / i;
		  }catch (ArithmeticException errInf) {
			  j = 999;
			  System.out.println( "errInf = " + errInf ); 
		  }finally{
			  System.out.println( "i = " + i + ", j = " + j );
		  }
	  }
	}
