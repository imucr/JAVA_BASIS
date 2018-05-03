package sougouZisshuu.sigekiJava.ch20NetworkTsuushinProgramming.messageKoukan;

import java.io.*;
import java.net.Socket;

class ClientExample1 {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1", 2004);
				/*
				MEMO
					・Serverあるパソコンのアドレス(127.0.0.1＝localhost)、ServerのPort番号。
					・ClientのPort番号は、OSで使用していないPortを自動的にもらう。
				*/
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String str = "Hello, Server";
			out.write(str.getBytes());
			
			byte arr[] = new byte[100];
			in.read(arr);
			
			System.out.println(new String(arr));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				
			}
		}
	}

}
