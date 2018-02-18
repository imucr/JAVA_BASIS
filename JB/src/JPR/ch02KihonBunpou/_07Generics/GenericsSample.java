package JPR.ch02KihonBunpou._07Generics;

/*
Generics：
	汎用的なクラスを、コンパイル時に特定の型に対応付ける。
*/
class GenericClass<T> {
	T value;
	
	public void setValue(T val) {
		T value2 = val;
		this.value = value2;
	}
	
	public T getValue() {
		return this.value;
	}
}

public class GenericsSample {

  public static void main(String[] args) {
	  GenericClass<Integer> gc1 = new GenericClass<Integer>();
	  gc1.setValue(123);
	  System.out.println(gc1.getValue());
	  
	  GenericClass<String> gc2 = new GenericClass<String>();
	  gc2.setValue("文字列");
	  System.out.println(gc2.getValue());
  }
}
