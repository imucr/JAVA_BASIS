package sougouZisshuu.sigekiJava.ch6KeishouToInterface.toshokanSiryouKanri;

class AppCDInfo extends CDInfo implements Lendable {

	String borrower;
	String checkOutDate;
	byte state;
	
	AppCDInfo(String registerNo, String title) {
		super(registerNo, title);		
	}

	@Override
	public void checkOut(String borrower, String date) {
		
		if (state != 0) {
			return; //MEMO メソッドを終了して、呼び出し元に戻る。voidメソッドの中でだけ使用可。
		}
		
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		
		System.out.println("＊「" + title + "」CDが貸し出されました。");
		System.out.println("貸出人：" + borrower);
		System.out.println("貸出日：" + date + "\n");
	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		
		System.out.println("＊「" + title + "」CDが返却されました。" + "\n");
	}
	
}
