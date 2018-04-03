package sougouZisshuu.sigekiJava.ch2JavaKiso;

//ローカル変数：属するブロックの中でしか使えない。
public class MaxNumber {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		int max = 0;
		
		if (num1 > num2) {
			max = num1;
		}else {
			max = num2;
		}
		
		System.out.println(max);
	}

}
