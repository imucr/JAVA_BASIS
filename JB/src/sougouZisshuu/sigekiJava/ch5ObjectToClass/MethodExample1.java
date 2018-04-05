package sougouZisshuu.sigekiJava.ch5ObjectToClass;

//【特定文字を指定した回数反復出力】：staticメソッドの特徴の例示
public class MethodExample1 {

	public static void main(String[] args) {
		MethodExample1 m1 = new MethodExample1();
		
		m1.printCharacter('*', 30);
			/*MEMO 
			 	printCharacterメソッドがmainメソッドのようにstaticなら、クラスのインスタンス化しなくてすぐ使うことができる。
			 	これを、「静的メソッドではインスタンスメソッドを呼び出すことができない」と言える。
			 */
		System.out.println("Hello, Java");
		m1.printCharacter('-', 30);
	}
	
	void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
