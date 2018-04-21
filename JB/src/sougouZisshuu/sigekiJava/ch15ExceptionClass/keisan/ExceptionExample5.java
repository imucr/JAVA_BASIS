package sougouZisshuu.sigekiJava.ch15ExceptionClass.keisan;

/*
【計算エラー出力】
	・割り算と引き算の計算エラーの詳細を出力。
	・Exceptionオブジェクトを生成すると、自分が設定したメッセージ出力可能の例示。

	＊Exception:
		・Exceptionクラス、Errorくらすはjava.lang.Throwableクラスを継承。
		・Exceptionは深刻ではない例外、Errorは深刻な例外。
*/
class ExceptionExample5 {

	void warizan() {
		int num1 = 2, num2 = 0;
		
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			String str = e.getMessage();
			System.err.printf("①Exceptionオブジェクト生成X場合：%n%s", str);
		}
		
	}
	
	
	void hikizan() {
		int num1 = 2, num2 = 3;
		
		try {
			int result = num1 - num2;
			if (result < 0) {
				throw new Exception("結果が間違っています。");
			}
			System.out.println(result);
		} catch (Exception e) {
			String str = e.getMessage();
			System.err.printf("%n%n②Exceptionオブジェクト生成○場合：%n%s", str);
		}
	}

	
	public static void main (String[] args) {
		ExceptionExample5 e5 = new ExceptionExample5();
		
		e5.warizan();
		
		e5.hikizan();
	}
}
