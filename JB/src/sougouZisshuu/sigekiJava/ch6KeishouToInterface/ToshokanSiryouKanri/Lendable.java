package sougouZisshuu.sigekiJava.ch6KeishouToInterface.ToshokanSiryouKanri;

interface Lendable {
	void checkOut(String borrower, String date); //MEMO Interfaceは必ず抽象メソッドを持つので、abstractを付けなくてもコンパイラーが追加すてくれる。
	void checkIn();
}
