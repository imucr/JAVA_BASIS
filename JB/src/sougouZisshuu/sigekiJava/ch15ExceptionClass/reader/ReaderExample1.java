package sougouZisshuu.sigekiJava.ch15ExceptionClass.reader;
import java.io.*;

/*
【外部のファイルを読み込む】
	・FileNotFoundException、IOException、NullPointerExceptionの例示。
*/
class ReaderExample1 {

	public static void main(String[] args) {
		
		FileReader reader = null;

		try {

			reader = new FileReader("C:\\Users\\CH\\Desktop\\poem.txt");

			while (true) {
				
				int data = reader.read();
				
				if (data == -1) {
					break;
				}
				
				char ch = (char) data;
				System.out.print(ch);
			}
			
			reader.close();
			
		} catch (FileNotFoundException fnfe) { //MEMO IOExceptionにしていい。サブクラスであるFileNotFoundExceptionも処理できるので。
			System.out.println("ファイルが存在しません。");
		} catch (IOException ioe) {
			System.out.println("ファイルを読み込むことができません。");
		} finally {
			try {
				reader.close(); //QUESTION 「この時のreaderはnullなので、NullPointerException発生」とは、どういう原理？
			} catch (Exception e) {
				
			}
		}
	}

}
