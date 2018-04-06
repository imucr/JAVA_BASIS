package sougouZisshuu.sigekiJava.ch6KeishouToInterface.toshokanSiryouKanri;

//データとしてstatic final正数の代わりに、列挙型使用。
interface Lendable {

	enum BookState {
		STATE_BORROWED, STATE_NORMAL
	}
	
	void checkOut(String borrower, String date); //MEMO Interfaceは必ず抽象メソッドを持つので、abstractを付けなくてもコンパイラーが追加すてくれる。
	void checkIn();
}
