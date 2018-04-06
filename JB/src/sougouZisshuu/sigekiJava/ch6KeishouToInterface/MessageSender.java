package sougouZisshuu.sigekiJava.ch6KeishouToInterface;

/*【メッセージ送信器の仕様】：Interfaceの特徴の例示
	・Interfaceのフィールドは、コンパイルの時、自動的にfinal staticが付くので、初期値を代入しなければならない。
	・コンストラクタ持てない。
	・メソッドはコンパイル過程で自動的に抽象(abstract)になる。
*/
interface MessageSender { //QUESTION public自動？
	String title = "おはようございます";
	String senderName = "Forest";
	
//	MessageSender(String title, String senderName) { 
//		this.title = title;
//		this.senderName = senderName;
//	}
	
	abstract void sendMessage(String recipient);
}
