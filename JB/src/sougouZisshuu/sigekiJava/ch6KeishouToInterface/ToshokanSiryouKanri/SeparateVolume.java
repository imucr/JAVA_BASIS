package sougouZisshuu.sigekiJava.ch6KeishouToInterface.toshokanSiryouKanri;

class SeparateVolume implements Lendable {
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	BookState state;
	
	SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
		this.state = BookState.STATE_NORMAL;
			//MEMO 列挙型はクラスとして取り扱われるので、デフォルト値はnull。それでstatic final正数を使う場合とは違って、初期値の必要。
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (state != BookState.STATE_NORMAL) {
			return;
		}
		
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = BookState.STATE_BORROWED;
		
		System.out.println("＊「" + bookTitle + "」が貸し出されました。");
		System.out.println("貸出人：" + borrower);
		System.out.println("貸出日：" + date + "\n");

	}

	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = BookState.STATE_NORMAL;
		System.out.println("＊「" + bookTitle + "」が返却されました。" + "\n");
	}
	
}
