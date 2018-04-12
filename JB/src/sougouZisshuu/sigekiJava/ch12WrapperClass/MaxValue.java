package sougouZisshuu.sigekiJava.ch12WrapperClass;

/*
【大きい数判定】
	・文字列を数値に変えて大きさ比較。
	・Wrapper Class IntegerのparseIntメソッドの例示。
	
	＊Wrapper Class
		・Primitive型データをオブジェクト化。
			例）int → Integer
		・Wrapper classで作られたオブジェクトを、Wrapper Objectと呼ぶ。
			例）Integer obj = new Integer(1234);
*/
class MaxValue {
	public static void main(String[] args) {
		
		String[] a = {"4", "1"};
		System.out.printf("配列の要素は%d個です。\n", a.length);

		if (a.length != 2) {
			System.out.println("比較する整数は二つにしてください。" );
			return;
		} try {
			int num1 = Integer.parseInt(a[0]);
			int num2 = Integer.parseInt(a[1]);
			
			if (num1 > num2) {
				System.out.printf("%dが%dより大きいです。", num1, num2);
			} else {
				System.out.printf("%dが%dより大きいです。", num2, num1);
			}
		} catch (NumberFormatException e) {
			System.out.println("文字列を数値に変換してからご比較お願いします。"); //QUESTION この文章を出力するには、どうすれば？
		}
	}
}
