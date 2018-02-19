package java8.ch05HensuuTeisuuToKata;

import java.nio.ByteBuffer;

public class Tsuika {
	public static void main(String[] args){
		
		/* 
		　＊byte配列
		 	①長所：色々な形の値を一つのまとまったメモリに連続して書き込み可能
		 	②例：６つの要素を持つbyte配列(6byte)に、short数値(2byte)とint数値(4byte)挿入
		 
		 */
			short putShortValue = 1212;
			int putIntValue = 1234567890;
			byte[] array;
			array = new byte[6];
			
			ByteBuffer byteBuffer = ByteBuffer.wrap(array);
			byteBuffer.putShort(0, putShortValue); //MEMO byte配列であれば、メモリの位置を自由指定可
			byteBuffer.putInt(2, putIntValue);

			int getShortValue = byteBuffer.getShort(0);
			int getIntValue = byteBuffer.getInt(2);
			System.out.println("shortの値は"+getShortValue); 
			System.out.println("intの値は"+getIntValue); 
		
	}
}
