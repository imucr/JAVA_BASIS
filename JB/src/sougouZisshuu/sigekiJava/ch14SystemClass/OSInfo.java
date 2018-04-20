package sougouZisshuu.sigekiJava.ch14SystemClass;

/*
【OS名＆バージョン出力】
	・SystemクラスのgetPropertyメソッド利用の例示。
	
	＊Systemクラス：
		・OSとの相互作用に役立つ機能のまとめ。
		・フィールドとメソッドがstaticなので、インスタンス化不要。
*/
class OSInfo {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name"); //MEMO keyの種類は、getPropertiesメソッドのJavaDocに説明。
		String osVersion = System.getProperty("os.version");
		System.out.printf("%s version %s %n", osName, osVersion);
	}

}
