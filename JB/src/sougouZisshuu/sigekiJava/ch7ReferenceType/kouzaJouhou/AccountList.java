package sougouZisshuu.sigekiJava.ch7ReferenceType.kouzaJouhou;

/*
 【口座orデビットカード口座情報の入出力】
	・口座情報を出力する。但し、デビットカード口座のインスタンスだったら、カード番号も出力。
	・「クラス変数には、そのクラスのオブジェクトとサブクラスのオブジェクトを代入可能」の例示。
*/	
class AccountList { //TODO Account、CheckingAccountのメソッド使用

	public static void main(String[] args) {
		Account obj1 = new Account("111-22-333333", "羽丘芽美", 10000);
		Account obj2 = new Account("777-88-999999", "深森聖良", 30000);
		Account obj3 = new CheckingAccount("444-55-666666", "飛鳥大貴", 20000, "5555-6666-77777-8888");
		Account obj4 = new Account("000-00-000000", "キュー", 0);
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
		
	}
	
	static void printAccountInfo(Account obj) {
		System.out.println("アカウント番号：" + obj.accountNo);
		System.out.println("アカウントオーナーの名前：" + obj.ownerName);
		System.out.println("残額：" + obj.balance);
		
		if (obj instanceof CheckingAccount) { //MEMO 「オブジェクト insutanceof タイプ」、objがChekingAccountのインスタンスだったらtrue
			
			CheckingAccount obj2 = (CheckingAccount) obj;
			System.out.println("カード番号：" + obj2.cardNo);
		}
		
		System.out.println();
	}
}
