package jpr.ch02KihonBunpou._04Class;

/*
void：
	① 戻り値無しの時使う：出力だけ・変数の値変える時。
	②「return」使わない。
	③「戻り値のないreturn」使うと、メソッド終了の機能。
*/
public class VoidSample {

	static int num;

  public static void main(String[] args) {
	  VoidSample vs = new VoidSample();
	  vs.counter();
	  System.out.println(num);
  }
  
  public void counter() {
	  for(int i = 1; i < 100; i++){
		  num = i;
		  if(i == 50) {
			  return;
		  }
	  }
	  System.out.println("for文終了後");
  }
}
