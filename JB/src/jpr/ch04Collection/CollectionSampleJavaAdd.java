package jpr.ch04Collection;

import java.util.ArrayList;
import java.util.Collection;

//Collectionに要素追加
public class CollectionSampleJavaAdd {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>(); //MEMO Java SE 7から、クラス名の後の型指定を<>だけで可。

		
		for(int i = 0; i < 3; i++) {
			c1.add( Integer.toString(i) );
				/*MEMO
				 Collection Interfaceの中でロジックは見えない。（カプセル化）
				 しかも、ライブラリー化すると公開されたヘッダー定義以外には見れない
				 */
				
				//TODO カプセル化の例示
			
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
