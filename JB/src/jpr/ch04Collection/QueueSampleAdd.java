package jpr.ch04Collection;

import java.util.concurrent.LinkedBlockingDeque;

/*
Queueに要素を追加

　　　　　可　　　不
　①add   true  例外発生
　②offer true  false   →通常使用

 */
public class QueueSampleAdd {

	public static void main(String[] args) {
		LinkedBlockingDeque<String> queue = new LinkedBlockingDeque<>(2);
		
		System.out.println("add A：" + queue.add("A"));
		System.out.println("add B：" + queue.add("B"));
		
		try {
			System.out.println("add C：" + queue.add("C"));
		} catch (Exception e) {
			System.out.println("例外発生：" + e.getMessage());
		}
		
		System.out.println("add C：" + queue.offer("C"));
	}

}
