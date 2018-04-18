package sougouZisshuu.sigekiJava.ch13Collection;

import java.util.LinkedList;

/*
LinkedListのremoveLastメソッドの例示 //TODO 何かのプログラム化すること。
*/
class DoubleStack {

	public static void main(String[] args) {
		LinkedList<Double> stack = new LinkedList<>();
		
		stack.addLast(10.3); //MEMO double型の 10.3は、Doubleに自動Boxingされる。
		stack.addLast(5.2);
		stack.addLast(7.4);
		stack.addLast(10.2);
		
		while(!stack.isEmpty()) {
			double num = stack.removeLast(); //MEMO Doubleがdoubleに自動unboxingされる。
			System.out.println(num);
		}
	}

}
