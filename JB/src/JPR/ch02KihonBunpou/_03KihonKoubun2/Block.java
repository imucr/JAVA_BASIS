package JPR.ch02KihonBunpou._03KihonKoubun2;

//Block：処理の範囲・変数のスコープの指定可能
public class Block {

  public static void main(String[] args) {
	  int i = 5;
	  if (i == 5) {
		  int x = 5;
		  System.out.println(x); 
	  }
	  {
		  int x = 10; //MEMO ブロックのおかげで、変数xの重複宣言可。
		  System.out.println(x);		  
	  }
  }
}
