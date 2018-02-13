package JPR.ch02KihonBunpou._04Class;

/*
Default Constructor：
	①Constructor定義しないと自動生成される、引数のないConstructor。
	②引数を指定したConstructorを定義した場合、自動生成X
 */
public class TestClass {

  public static void main(String[] args) {
	  Template obj = new Template();
	  System.out.println("デフォルトコンストラクタ利用" + obj.getInt()); //MEMO TODO タイプ別初期値復習

	  Template obj2 = new Template(22);
	  System.out.println("引数のあるコンストラクタ利用" + obj2.getInt()); //QUESTION なんで「obj2.a」ではできない？
  }
}

class Template {
	private int a;
	
	Template(){
		
	}
	
	Template(int a){
		this.a = a;
	}
	
	int getInt(){
		return this.a;
	}
}
