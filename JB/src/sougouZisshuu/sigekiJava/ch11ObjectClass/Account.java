package sougouZisshuu.sigekiJava.ch11ObjectClass;

/*
【口座情報入出力・使用】
	・ObjectクラスのtoStringメソッド使用の例示。

	＊toStringメソッド
		・オブジェクトが持っている値を文字列にしてreturn。
		・意味のある文字列をreturnしたければ、Override(Public修飾子維持)。
		・オブジェクト名だけ書いても自動的に呼び出される。
*/
class Account {
	
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("残額が足りないです。");
		}
		
		balance -= amount;
		return amount;	
	}
	
	public String toString() {
		return "口座番号："    + accountNo + 
			   "\n口座名義人：" + ownerName + 
			   "\n残額："     + balance   + "円"; //QUESTION int値がString値に自動変換？
	}

	public static void main(String[] args) throws Exception {
		Account ac = new Account("1234567", "安室奈美恵", 230000000);
		
		ac.deposit(10);
		
		System.out.printf("残額：%d\n\n", ac.balance);
		
		try {
			ac.withdraw(5);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println(ac.toString()); //MEMO acだけ書いても文字列出力。toStringは自動的に呼び出される。
		}
	
	}

}
