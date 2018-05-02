package sougouZisshuu.sigekiJava.ch17Chokuretsuka.rectangleIO;

import java.io.*;

/*
【長方形の情報を、ファイルから読み込む】
	・逆直列化の例示。
*/
class ObjectInput {

	public static void main(String[] args) {
		ObjectInputStream in = null;
		
		try {
			in = new ObjectInputStream(new FileInputStream("C:/Users/CH/Desktop/output2.dat")); //QUESTION dat vs. txt？
			Rectangle rt = (Rectangle) in.readObject();

			System.out.printf("長方形(＝矩形)の幅は%s、高さは%sである。そして面積は%dである。", rt.width, rt.height, rt.getArea());
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("ファイルが存在しません。");
		} catch (EOFException eofe) {
			System.out.println("終わり");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("当該クラスが存在しません。");
		} finally {
			try {
				in.close();
			} catch (Exception e) {
				
			}
		}
	}

}
