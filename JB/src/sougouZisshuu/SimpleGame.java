package sougouZisshuu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
SUM Q＆Aゲーム
　answer＞bufferedReader＞InputStreamReader＞System.in
*/
public class SimpleGame {

	public static void main(String[] args) {
		System.out.println("Q：日本の首都はどこですか？");
		System.out.println("　1：大阪");
		System.out.println("　2：東京");
		System.out.println("　3：埼玉");
		System.out.println("　答えを番号で入力し、改行を押してください。→");

		InputStreamReader inputStreamReader = new InputStreamReader(System.in); 
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int answer = 0;
		String message = "間違いです";
		
		try {
			String buf = bufferedReader.readLine();
			answer = Integer.parseInt(buf);			
		} catch (Exception exception) {
			answer = 0;
			message = "答えを番号で入力してください。";
		}
		
		if (answer == 2) {
			message = "正解です。";
		}
		
		System.out.println(message);
	}

}
