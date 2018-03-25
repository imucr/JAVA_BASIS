package jpr.ch04Collection;

import java.util.Collection;

public class Chap4Tool {

	public static <E> void dispCollection(Collection<E> c, String colName){
		System.out.print(colName + ": ");
		for(E tmp : c) System.out.print(tmp + " ");
		System.out.println(); System.out.println();
	}

}
