package java8.ch12Reigaishori2;

//throws：呼び出し側で例外処理
	public class ThrowsTest {
	
	  static int div(int i, int j) throws ArithmeticException {
	    return i/j;
	  }
	
	  public static void main(String[] args) {
	    int i = 5, j = 0, ans = 0;
	    try {
	      ans = div(i, j); //MEMO divメソッドにstaticつけない場合、ThrowsTestをインスタンス化してから使用可。
	      System.out.println(ans);
	    } catch (ArithmeticException e) {
	      System.out.println("例外：" + e);
	    }
	  }
	}
