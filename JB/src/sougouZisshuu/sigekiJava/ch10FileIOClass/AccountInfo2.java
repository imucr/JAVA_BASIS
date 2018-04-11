package sougouZisshuu.sigekiJava.ch10FileIOClass;

import sougouZisshuu.sigekiJava.ch7ReferenceType.kouzaJouhou.Account;
	//MEMO 他のパッケージのクラスを使用したいとき、import使用。

/*
【口座情報出力】
	・printfメソッドの書式使用の例示 
*/
class AccountInfo2 {

	public static void main(String[] args) {
		Account obj = new Account("999-88-1111111", "南太郎", 1000);
		System.out.printf("口座番号：%s%n", obj.accountNo); //TODO 使用方法まとめ
		System.out.printf("口座名義人：%s%n", obj.ownerName);
		System.out.printf("残額：%d%n", obj.balance);

	}

}
