package JPR.ch02KihonBunpou._02Enzansi;

//cast
public class OperatorSample2 {
	public static void main (String[] args){
		int x = 15;
		long y = x;
		byte z = (byte) y; //MEMO もっと大きいデータ型の値の代入には、キャスト必要。

		System.out.println(z); 
	}
}
