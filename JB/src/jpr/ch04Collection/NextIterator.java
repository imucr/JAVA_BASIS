package jpr.ch04Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//コレクションの要素判定・取得
public class NextIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("morning");
		list.add("noon");
		
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

	}

}
