package sougouZisshuu.sigekiJava.ch13Collection.seisekiChousa;

import java.util.HashMap;

/*
【ハーマイオニーで検索して、彼女の成績を出力】
	・Hash Tableの例示。
	
	＊Hash Table
		・キー値を利用してデータが入る箱の番号を計算。
		・箱の番号はObjectクラスのHashCodeメソッドによって決定。
			・異なるオブジェクトであっても、同じフィールドを持っていれば同じ値をreturn。
*/
class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashtable = new HashMap<>(); //QUESTION intは使えない理由？
		
		hashtable.put("ハリー", new Integer(95));
		hashtable.put("ハーマイオニー", new Integer(100));
		hashtable.put("ロン", 30);

		Integer num = hashtable.get("ハーマイオニー");
		System.out.println("ハーマイオニーの成績は？　" + num + "点");
	}

}
