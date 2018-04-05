package sougouZisshuu.sigekiJava.ch6KeishouToInterface.ToshokanSiryouKanri;

/*
【図書館貸出・返却】：継承とインターフェスの比較例示
	・原理：
		「対象の情報」と「貸出人の情報」を受け取って、貸出or返却。

	・仕組み：
			貸出可能			CD情報
		　　↗　　　　　　↖　　　　↙
		単行本		付録CD

		＊インターフェス：共通機能抽出。（共通データX）


	＊1：多能性（ポリモーフィズム）：サブクラスごとに全く別の機能を実装可能。
				
		例）Animal animals[] = {new Dog(), new Cat(), new Duck()};
			for(int i=0; i<animails.length; i++){
				animals[i].cry();
			}

*/
public class TestExample {

	public static void main(String[] args) {
		Lendable arr[] = { //MEMO 多能性　→　上段の＊１
				new AppCDInfo("2005-7001", "Redhat Fedora"),
				new SeparateVolume("859a986b", "机は机である", "ビックセル")
		};
		
		checkOutAll(arr, "村上佳菜子", "20100909");
		
		checkOutAll(arr, "田中太郎", "20100910");

		checkInAll(arr);
	}

	static void checkOutAll(Lendable arr[], String borrower, String date) {
		for (Lendable obj : arr) {
			obj.checkOut(borrower, date);
		}
	}
	
	static void checkInAll(Lendable arr[]) {
		for (Lendable obj2 : arr) {
			obj2.checkIn();
		}
	}
}
