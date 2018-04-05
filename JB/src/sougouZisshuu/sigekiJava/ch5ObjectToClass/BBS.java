package sougouZisshuu.sigekiJava.ch5ObjectToClass;

//【ネット掲示板】：オブジェクト生成(インスタンス化)の例示
class BBSItem {
	static int lastSeqNo = 0;
	int secNo;
	String writer;
	String writtenDate;
	String title;
	String content;
	
	BBSItem(String writer, String writtenDate, String title, String content) {
		this.secNo = ++lastSeqNo;
			/*MEMO
			 	一連番号は、
				すべてのオブジェクトが共通的に接近するデータである。なので、staticにする必要がある。
				新しいオブジェクトが生成される時、自動増加。
				lastSeqNoは1が増加してから、secNoに代入される。
			*/
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;
	}
	
	void print() {
		System.out.println("【番号】" + secNo + " |【作成者】" + writer + " | 【作成日時】" + writtenDate);
		System.out.println("===================================");
		System.out.println("【タイトル】" + title);
		System.out.println("【内容】" + content);
		
		System.out.println();
	}
}

public class BBS {
	public static void main (String[] args) {
		BBSItem bi = new BBSItem("高橋未来", "1月1日", "腹減った", "朝ごはん食べたいな。");
		bi.print();
		
		BBSItem bi2 = new BBSItem("林みどり", "3月3日", "コーヒー美味しい", "Sサイズなのに大量。");
		bi2.print();
	}
	
}