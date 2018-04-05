package sougouZisshuu.sigekiJava.ch6KeishouToInterface.ToshokanSiryouKanri;

class SeparateVolume implements Lendable {
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;
	
	SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (state != 0) {
			return;
		}
		
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		
		System.out.println("＊「" + bookTitle + "」が貸し出されました。");
		System.out.println("貸出人：" + borrower);
		System.out.println("貸出日：" + date + "\n");

	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("＊「" + bookTitle + "」が返却されました。" + "\n");
	}
	
}
