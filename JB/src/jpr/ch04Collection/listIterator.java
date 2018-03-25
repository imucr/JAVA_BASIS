package jpr.ch04Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/*Iterator(反復子)：
	①コレクションの要素を１つずつ順番に処理するためのクラス。
	②様々なコレクションに対して同じメソッドで操作可。
*/
public class listIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			list.add(random.nextInt(2)); //MEMO 0～n-1の値をランダムに代入
		}
		
		Chap4Tool.dispCollection(list, "ListIterator");
		
		ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.nextIndex() + "→" + iterator.next() + "、");
		}
	}

}
