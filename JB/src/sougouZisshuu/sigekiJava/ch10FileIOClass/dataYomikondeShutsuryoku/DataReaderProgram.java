package sougouZisshuu.sigekiJava.ch10FileIOClass.dataYomikondeShutsuryoku;

import java.io.*;

class DataReaderProgram {

	public static void main(String[] args) {
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream("C:/Users/CH/Desktop/output.dat"));			
			int num1 = in.readInt();
			int num2 = in.readInt();
			double num3 = in.readDouble();
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("ファイルが存在しません。");
		} catch (EOFException eofe) {
			System.out.println("終わり");
		} catch (IOException e) {
			System.out.println("ファイルを読み込むことができません。");
		} finally {
			try {
				in.close();
			} catch (Exception e) {
				
			}
		}
	}

}
