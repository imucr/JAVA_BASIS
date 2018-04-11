package sougouZisshuu.sigekiJava.ch7ReferenceType.kouzaJouhou;

/*
クラスとフィールドにpublicが付いている理由：
sougouZisshuu\sigekiJava\ch10FileIOClass\AccountInfo2.javaで呼び出されているため。
*/
public class Account {
	public String accountNo;
	public String ownerName;
	public int balance;
	
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
}
