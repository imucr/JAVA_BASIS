package jpr.ch04Collection;

import java.util.ArrayList;
import java.util.Collection;

//Collectionに要素追加
public class CollectionSampleJavaAdd {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>(); //QUESTION <>に書くことできる理由？

		
		for(int i = 0; i < 3; i++) {
			c1.add( Integer.toString(i) );
				//QUESTION Collection Interfaceの中でロジックは見えない。どうしてaddメソッドが作動？
			
		}
		
		Collection<String> c2 = new ArrayList<>();
		c2.add("one");
		c2.add("two");
		
		System.out.println("c1：" + c1 ); 
		System.out.println("c2：" + c2 ); 
		
		c1.addAll(c2); //MEMO 指定コレクションの要素全てを追加。
		System.out.println("c1 + c2：" + c1); 
	}
}
