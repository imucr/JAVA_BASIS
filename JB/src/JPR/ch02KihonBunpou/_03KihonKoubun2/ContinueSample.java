package JPR.ch02KihonBunpou._03KihonKoubun2;

//Continue：その時点のループ内の処理のみ中断。
public class ContinueSample {

  public static void main(String[] args) {
	  for (int i = 0; ; i++) { //MEMO ループ判定式は、このように必要によって省略可。
		  if (i < 8) {
			  continue;
		  }else if (i == 10) {
			  break;
		  }
		  System.out.println(i); 
	  }
  }
}
