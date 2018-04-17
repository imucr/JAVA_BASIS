package sougouZisshuu.sigekiJava.ch13Collection.seisekiChousa2;

import java.util.HashMap;

/*
【】
	・
*/
class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Name, Integer> hashtable = new HashMap<Name, Integer>();
		
		hashtable.put(new Name("ハリー", "ポッター"), new Integer(50));
		hashtable.put(new Name("ハーマイオニー", "グレインジャー"), new Integer(105));
		hashtable.put(new Name("ロン", "ウィーズリー"), new Integer(60));
		
		Integer num = hashtable.get(new Name("ハーマイオニー", "グレインジャー"));
		System.out.println("ハーマイオニーの成績は？　" + num + "点");
	}

}
