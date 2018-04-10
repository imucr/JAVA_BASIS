package sougouZisshuu.sigekiJava.ch10FileIOClass.mojiretsuFileKakikomi;

import java.io.FileWriter;
import java.io.IOException;

/*
【文字列をファイルに書き込み】
	・FileWriter vs. PrintWriter(もっと簡単)の例示
*/
class DullProgram {

	public static void main(String[] args) {

		FileWriter writer = null;

		try {
			writer = new FileWriter("output.txt");
			String str1 = "タラコ　タラコ";
			String str2 = "たっぷり　タラコ";
			
			for (int cnt = 0; cnt < str1.length(); cnt++) {
				writer.write(str1.charAt(cnt));
			}			
			writer.write('\n');
			
			for (int cnt = 0; cnt < str2.length(); cnt++) {
				writer.write(str2.charAt(cnt));
			}
			writer.write('\n');
		} catch (IOException ioe) {
			System.out.println("ファイルで出力できません。");
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}
	}

}
