package jpr.ch02KihonBunpou._01DataGataToHensuu;

//変数のスコープ
public class ScopeSample {
	static int val1 = 0;
	int val2 = 1;
	
  public static void main(String[] args) {
	int x = 2;
	ScopeSample ss = new ScopeSample();
	
	System.out.println(val1);
	System.out.println(ss.val2); //MEMO クラスをインスタンス化してから呼ばないとエラー
	System.out.println(x);
	
  }
}
