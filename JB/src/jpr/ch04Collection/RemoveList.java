package jpr.ch04Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveList {

	//リストの要素を削除
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(Arrays.asList("one", "two", "three"));
		
		System.out.println("list:" + list);
		System.out.println("インデックス２の要素を削除");
		
		list.remove(1);
		System.out.println("list:" + list);
	}

}
