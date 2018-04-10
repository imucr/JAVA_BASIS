package sougouZisshuu.sigekiJava.ch10FileIOClass.dataYomikondeShutsuryoku;

import java.io.*;

/*
【ファイルに保存したデータを読み込む】
	・ファイルを作って、データを書いて（Output）、それを読み込む（Input）。
	・ファイル入出力クラスの例示。
	
	＊Output Stream（プログラムから外へ出るストリーム）　vs.　Input Stream（プログラムに入ってくるストリーム）
*/
class DataSaverProgram {

	public static void main(String[] args) {
		DataOutputStream out = null;
		
		try {
			out = new DataOutputStream(new FileOutputStream("C:/Users/CH/Desktop/output.dat"));
				//MEMO DataOutputStreamは、ファイルにデータを書き込む機能がないため、fileOutputStreamと一緒に使用必須。
			out.writeInt(7);
				//MEMO int値を4バイトに分割して、FileOutputStreamのwriteメソッドを4回呼び出し。
				//QUESTION 「4バイトに分割」の意味？
			out.writeInt(5);
			out.writeDouble(17.5);
		} catch (IOException ioe) {
			System.out.println("ファイルで出力できません。");
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				
			}
		}
		
	}

}
