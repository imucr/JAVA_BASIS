package sougouZisshuu.sigekiJava.ch13Collection.posting;

import java.util.LinkedList;

class BBS {
	LinkedList<BBSItem> items;
	
	BBS() {
		items = new LinkedList<BBSItem>(); //MEMO Indexは1個だけ。 
	}
	
	void add(BBSItem item) {
		items.add(item);
	}
	
	void modify(int index, BBSItem item) {
		items.set(index, item);
	}
	
//  TODO getメソッド使用：インデックスに該当する値がオブジェクトの場合、どうやって出力するか。
//	void get(int index) {
//		items.get(index);
//	}
	
	void delete(int index) {
		items.remove(index);
	}
}
