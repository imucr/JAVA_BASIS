package sougouZisshuu.sigekiJava.ch13Collection.posting;


class BBSItem {
	String title;
	String writer;
	String writtenDate; //TODO GregorianCalendar型に直そう。
	String content;
	
	BBSItem(String title, String writer, String writtenDate, String content) {
		this.title = title;
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.content = content;
		
	}
	
}