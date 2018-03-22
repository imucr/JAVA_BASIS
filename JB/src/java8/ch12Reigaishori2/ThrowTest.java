package java8.ch12Reigaishori2;

//throw：任意に例外発生させる
	public class ThrowTest {
	
		static int div(int i, int j) {
			if (j < 5) throw new ArithmeticException("例外をスロー");
			return i/j;
		}
		
	  public static void main(String[] args) {
		  int i = 10000, j = 4, ans = 0;
		  try{
			  ans = div(i, j);
			  System.out.println(ans); 
		  }catch (ArithmeticException e) {
			  System.out.println( "例外：" + e ); 
		  }
	  }
	}
