package jpr.ch02KihonBunpou._03KihonKoubun;

/*
定数：
	変更できない値。
	プログラムの中で何度も使用する時使う。
 */
public class ConstSample {

  public static void main(String[] args) {
	 final float PI = 3.14159f; //MEMO 定数の変数名は大文字で。以降新しい値を代入しようとする時、コンパイルエラーとなる。
	 final int CELSIUS = 273;
	 
	 System.out.println(PI);
	 System.out.println(CELSIUS);
  }
}
