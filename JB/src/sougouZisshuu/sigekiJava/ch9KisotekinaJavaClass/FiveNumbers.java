package sougouZisshuu.sigekiJava.ch9KisotekinaJavaClass;

import java.util.Random;

/*
【1から5まで順番に入っている配列を、ランダムな順番で出力】
	・Java基礎APIの一つのRandomの例示。
*/
class FiveNumbers {

	public static void main(String[] args) {
		
		for(int i =0; i<5; i++) {
			
			int arr[] = {1, 2, 3, 4, 5};
			Random random = new Random();
			int index = random.nextInt(5);

			System.out.println(arr[index]);
		}
	}

}
