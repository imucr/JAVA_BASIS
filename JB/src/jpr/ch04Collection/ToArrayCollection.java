package jpr.ch04Collection;

import java.util.ArrayList;
import java.util.Collection;

public class ToArrayCollection {

	public static void main(String[] args) {
		
		//配列→コレクション
		Collection<String> col = new ArrayList<>();
		String[] number = {"one", "two", "three"};
		
		for (String tmp : number) {
			col.add(tmp);
		}
		
		System.out.println("colを配列に変換");
		
		
		//配列←コレクション
		Object[] objects = col.toArray();
		
		for (int i = 0; i < objects.length; i++) {
			System.out.print(i + "=" + objects[i] + " ");
		}

	}

}
