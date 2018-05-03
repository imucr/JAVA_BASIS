package sougouZisshuu.sigekiJava.ch20NetworkTsuushinProgramming.messageKoukan;

import java.io.*;
import java.net.*;

/*
【クライアント・サーバー間歓迎メッセージ交換】//TODO 3人以上同時チャットプログラム作成
	・TCP/IP Protocol通信の例示。

	・構造：
　　　　　　　　　　　　　Hello, Server
		クライアント　　　　　↔　　　　　　サーバー
	　　　　　　　　　　Hello, Client
	
	＊TCP/IP Protocol：
			
			クライアント　　　　　　　　　サーバー
		[[Socket]Port]IP　→　IP[Port[Socket]]
		
		①サーバーが連結要請待っていると、
		②クライアントから連結要請して、データ交換。
		
		＊「IP」でパスコン識別(ipconfigで確認可)、
		　「Port」でプログラム識別(netstatで確認可)
		　「Socket」でプログラム内でPort使用。
		
	＊実行方法
		①STS：Serverプログラム実行してからClientプログラム実行。反対はできない。
			→「Hello, Client」だけ確認可。
		②cmd：複数のcmdで、それぞれServerとClient実行。
			→「Hello, Client」、「Hello, Server」両方確認可。
*/
class ServerExample1 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(2004); //MEMO ServerのPort番号。
			socket = serverSocket.accept();
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			
			String str = "Hello, Client";
			out.write(str.getBytes());
		} catch (Exception e) { //QUESTION それぞれの状況に合うExceptionの書き込み基準？
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (Exception ignored) {
				
			} try {
				serverSocket.close();
			} catch (Exception ignored) {
				
			}
		}
	}

}
