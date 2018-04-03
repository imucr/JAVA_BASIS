package sougouZisshuu.sigekiJava.ch3PrimitiveType;

/*
byte：
	①サイズ：8bit＝1byte
	②範囲：2の8乗
*/
public class Total {

	public static void main(String[] args) {
		int total = 0;
		
		for (int cnt = 0; cnt < 200; cnt++) { //byteにしたら、範囲(2の8乗)を超えてしまうので結果出力X。
			total += cnt;
		}
		
		System.out.println(total);
	}

}
