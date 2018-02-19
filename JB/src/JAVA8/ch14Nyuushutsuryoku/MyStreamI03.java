package java8.ch14Nyuushutsuryoku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ストリーム入出力：キーボードから入力した文字列を、ディスプレイに表示
	public class MyStreamI03 {
	
	  public static void main(String[] args) {
		  try {
			  String inData;
			  InputStreamReader srObj = new InputStreamReader(System.in);
			  BufferedReader bObj = new BufferedReader(srObj);
			  
			  while((inData = bObj.readLine()) != null){
				  System.out.println(inData); 
			  }
		  }catch (IOException errInf) {
			  System.out.println("入出力エラー"+errInf); 
		  }
	  }
	}
