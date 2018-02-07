package JAVA8.ch14Nyuushutsuryoku;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//ファイル入出力：ファイルに入力して、出力。
	public class MyFileIO {
	
	  public static void main(String[] args) {
		  try{
			  String inData;
			  PrintWriter oWt = new PrintWriter(new BufferedWriter(new FileWriter("MyFileIO.txt")));
			  	//MEMO ファイルの位置はEclipse Workspaceフォルダ
			  oWt.println("ファイルにこの文章が入るかどうか試し中");
			  oWt.close();
			  
			  BufferedReader iBuf = new BufferedReader(new FileReader("FileIOTest.txt"));
			  inData = iBuf.readLine();
			  System.out.println(inData);
			  iBuf.close();
		  }catch (IOException errInf) {
			  System.out.println("入出力エラー" + errInf); 
		  }
	  }
	}
