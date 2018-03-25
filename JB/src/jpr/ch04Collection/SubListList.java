package jpr.ch04Collection;

import java.util.ArrayList;
import java.util.List;

public class SubListList {

	public static void main(String[] args) {
		
		//リスト出力（使用者定義関数）
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		Chap4Tool.dispCollection(list, "list");
		
		//リストの部分ビューを習得＆出力
		List<String> view = list.subList(1, 4); //リストの部分ビューを取得
		Chap4Tool.dispCollection(view, "view");
	}

}