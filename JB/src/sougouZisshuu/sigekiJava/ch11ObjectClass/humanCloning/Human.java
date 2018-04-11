package sougouZisshuu.sigekiJava.ch11ObjectClass.humanCloning;

/*
＊Cloneメソッド
	・同じ値を持っているオブジェクトをコピー。
	・ただし、Clonableなものだけ。（API仕様書に書いてある）
	・自分で作ったクラスをClonableにするには、
		①Clonable継承。
		②cloneメソッドOverride。
*/
class Human implements Cloneable {
	int x, y;
	
	Human(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void setX(int x) {
		this.x = x;
	}
	
	void setY(int y) {
		this.y = y;
	}
	
	public Object clone() { //QUESTION throw～を使うのがもっとキレイに見える？
		try {
			return super.clone();
		} catch (CloneNotSupportedException e){ //QUESTION ただのExceptionとは何の違い？
			return null;
		}
	}
	
	public String toString() {
		return "(英語の点数：" + x + ",　数学の点数：" + y + ")";
		
	}
	
}
