package sougouZisshuu.sigekiJava.ch7ReferenceType.iruiJouhou;

/*
Enum(列挙型)
	・限定された範囲の値だけを持つデータが対象。
		例：月曜～日曜、春～冬
	・static final正数の短所を解決。（コンパイルの時、分かりやすい）
		例： static final int SUMMER = 2; →　Season.SUMMER
	・列挙型はクラスとして取り扱い。列挙値もstatic final正数のように命名。
*/
enum Season {
	SPRING, SUMMER, FALL, WINTER
}
