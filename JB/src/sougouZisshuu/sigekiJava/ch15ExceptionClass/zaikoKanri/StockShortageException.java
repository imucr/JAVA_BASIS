package sougouZisshuu.sigekiJava.ch15ExceptionClass.zaikoKanri;

@SuppressWarnings("serial") //TODO 関連学習
class StockShortageException extends Exception {
	StockShortageException(String str) {
		super(str);
	}
}
