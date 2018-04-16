package sougouZisshuu.sigekiJava.ch13Collection.posting;

/*
【ネット掲示板】
　・ポストを作成して、その内容を出力。
　・LinkedListのメソッド使用の例示。
*/
class Posting {

	public static void main(String[] args) {
				
		BBSItem bi = new BBSItem("今日のご飯は何にするかな。", "HARAHETA", "18/04/16", "浅草でインドカレーとアイスクリーム食べよう。");
		
		BBS bbs = new BBS();
		
		bbs.add(bi);		
		System.out.println("【書き込み】");
		System.out.println(bi.title + "　|　" + bi.writer + "　|　" + bi.writtenDate);
		System.out.println("=========================================");
		System.out.println(bi.content);
		System.out.println();
		
		bi.title = "私がこれからすることは？";
		bi.writer = "マカロン好き";
		bbs.modify(0, bi);
		System.out.println("【タイトルと作成者名の修正後】");
		System.out.println(bi.title + "　|　" + bi.writer + "　|　" + bi.writtenDate);
		System.out.println("=========================================");
		System.out.println(bi.content);
		System.out.println();

		
		bbs.delete(0); //QUESTION 削除してもフィールド値が残っている理由？
		System.out.println("【ポスト削除後】");
		System.out.println(bi.title + "　|　" + bi.writer + "　|　" + bi.writtenDate);
		System.out.println("=========================================");
		System.out.println(bi.content);
		System.out.println();
	}

}
