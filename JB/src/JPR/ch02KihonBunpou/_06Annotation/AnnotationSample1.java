package JPR.ch02KihonBunpou._06Annotation;

/*
Annotation

①Annotation：Javaコンパイルに対して、ソースファイルに記述する注釈・オプションのようなもの。
②ソースコードのロジックに対して何の影響もない。
③標準Annotation：標準で提供されるもの。ex) @Override、@Deprecated、@SuppressWarning...
*/
class FigureSample {
	float getArea(float a, float b) {
		return 0.0f;
	}
}

class SquareSample extends FigureSample {
	
	@Deprecated
	public int sample(){ //MEMO 使用可能だが、Eclipse上で取り消し線が引かれる。
		return 0;
	}
	
	@Override //MEMO 引数の型が異なるとエラーとなる
	float getArea(float a, float b) {
		return a * b;
	}
	
}

@SuppressWarnings("unused")
public class AnnotationSample1 {

  public static void main(String[] args) {
	  int x; //MEMO @SuppressWarningsによって、「not used」warningが消えた。
	  SquareSample obj = new SquareSample();
	  System.out.println(obj.sample());
  }
}
