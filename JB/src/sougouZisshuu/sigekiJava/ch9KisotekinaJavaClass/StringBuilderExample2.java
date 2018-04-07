package sougouZisshuu.sigekiJava.ch9KisotekinaJavaClass;

/*
【歌詞編集】
	・基本Java APIの一つの、StringBuilder使用の例示。

	・StringBuilder：
		・String Bufferと似ているが、もっと簡単。
		・Stringと違って、文字列操作に新しいオブジェクト作らなくていい。
*/
class StringBuilderExample2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ごめんね　素直じゃなくて");
		printStringBuilder(sb);
		
		sb.append("思考回路はショート寸前");
		printStringBuilder(sb);
		
		sb.insert(12, "夢の中なら言える"); //MEMO offset: 挿入される部分配列の最初のcharのインデックス
		printStringBuilder(sb);
	}

	static void printStringBuilder(StringBuilder sb) {
		String str = sb.toString();
		int len = sb.length();
		int bufSize = sb.capacity();
		System.out.printf("%s(%d): %d %n", str, len, bufSize); //書式付き出力 //TODO 書式の使用方法学習
	}

}
