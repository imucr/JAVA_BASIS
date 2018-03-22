package java8.ch13ThreadToKeishou;

/*
Runnableインタフェース：
	複数処理並行可。
	すでに他のクラスを継承しているクラス(サブクラス)で、スレッドを使うことができる。
*/

	class Scene12 implements Runnable{ //FIXME Scene12 extends スーパークラス名 implements Runnable
	
	  @Override
	  public void run() {
		  for (int i = 1; i <= 5; i++){
			  System.out.println("地上の景色が遷移する"); 
			  try{
				  Thread.sleep(500);			  
			  }catch (InterruptedException e) {
				  
			  }
		  }	
	  }
		
	}
	
	public class Anime12a {
	
	  public static void main(String[] args) {
		  Scene12 sobj = new Scene12();
		  Thread tobj = new Thread(sobj);
		  tobj.start();
		  
		  for (int i = 1 ; i <= 5; i++) {
			  System.out.println("人を乗せた鳥が飛ぶ"); 
			  try{
				  Thread.sleep(500);
			  }catch (InterruptedException e) {
				  
			  }
		  }
	  }
	}
