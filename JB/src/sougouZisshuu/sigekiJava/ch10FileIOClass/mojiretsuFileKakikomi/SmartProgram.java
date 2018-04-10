package sougouZisshuu.sigekiJava.ch10FileIOClass.mojiretsuFileKakikomi;

import java.io.IOException;
import java.io.PrintWriter;

class SmartProgram {

	public static void main(String[] args) {
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("C:/Users/CH/Desktop/output.txt");
				//MEMO "output.txt"だけ書くと、プロジェクトフォルダの中に生成。
			
			String str1 = "チョコレート";
			String str2 = "ディスコ";
			
			writer.println(str1);
			writer.println(str2);
			
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
