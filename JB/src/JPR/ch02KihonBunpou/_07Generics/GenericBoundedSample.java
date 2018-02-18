package jpr.ch02KihonBunpou._07Generics;

/*
Genericsで変数型を制限：
	①T extends 型：指定型＋そのサブクラス
	②T super 型：指定型＋そのスーパークラス
*/
class NumberExtends<T extends Number> {
	T value;
	
	public void setValue(T val) {
		this.value = val;
	}
	
	public int intValue() {
		return this.value.intValue(); //QUESTION this.valueの型がTなので、intValue()をくっつけるのか。
	}
}

public class GenericBoundedSample {

  public static void main(String[] args) {
	  NumberExtends<Float> f = new NumberExtends<Float>();
	  f.setValue(1.23f);
	  System.out.println(f.intValue());
  }
}
