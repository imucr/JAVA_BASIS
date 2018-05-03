package sougouZisshuu.sigekiJava.ch17Chokuretsuka.rectangleIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
【長方形の情報を、ファイルを生成して書き込む】
	・直列化の例示。
	
	＊直列化
		・データをストリームに変えて、保存・伝送ができるようにすること。
		・オブジェクトもストリーム化の必要。この場合、当該クラスはSerializableクラスを継承する必要。
		・↔逆直列化
*/
class ObjectOutput {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("C:/Users/CH/Desktop/output2.dat"));			
			Rectangle rt = new Rectangle(100, 300);
			out.writeObject(rt);
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} finally {
			try {
				out.close();
			} catch (Exception e) {
				
			}
		}
	
	}

}
