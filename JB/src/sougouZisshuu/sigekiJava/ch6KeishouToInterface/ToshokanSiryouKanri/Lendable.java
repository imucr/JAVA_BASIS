package sougouZisshuu.sigekiJava.ch6KeishouToInterface.toshokanSiryouKanri;

/*
Interfaceのフィールド：
	・Interfaceを実装するクラスがよく使う正数は、Interfaceの中に宣言するのがよい。//QUESTION 正数vs定数？
	・Interfaceのフィールドにfinal static付けなくてもコンパイラーによって自動的に付く。
*/
interface Lendable {
	final static byte STATE_BORROWED = 1;
	final static byte STATE_NORMAL = 0;
	void checkOut(String borrower, String date); //MEMO Interfaceは必ず抽象メソッドを持つので、abstractを付けなくてもコンパイラーが追加すてくれる。
	void checkIn();
}
