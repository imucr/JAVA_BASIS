package jpr.ch02KihonBunpou._04Class;

/*
可変長引数：
	①「型名... 配列名」：指定した方の引数を複数記述可。配列として扱われる。
	② メソッドの最後の引数にだけ指定可。
*/
public class VLengthSample {

	void method(int a, String... args){
		
		System.out.println(a); 

		for (String s : args) {
			System.out.print(s); 
		}
		
		System.out.println(); 
		System.out.println("====="); 
	}
	
  public static void main(String[] args) {
	  VLengthSample v = new VLengthSample();
	  v.method(1, "a");
	  v.method(2);
	  v.method(3, "a", "b", "c");
  }
}
