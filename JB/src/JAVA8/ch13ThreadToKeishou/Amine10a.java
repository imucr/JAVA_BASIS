package JAVA8.ch13ThreadToKeishou;

//Threadクラス：複数処理並行可。

	class Scene10 extends Thread {
		public void run() { //MEMO ThreadクラスからOverrideしたメソッド。名称変更不可。
			for (int i = 1; i <= 10; i++) {
				System.out.println("地上の景色が遷移する"); 
				try{
					Thread.sleep(500); //MEMO ミリ秒単位。1000＝1秒。
				}catch (InterruptedException e) {
					
				}
			}
		}
	}
	
	public class Amine10a {
		
	  public static void main(String[] args) {
		  Scene10 sobj = new Scene10();
		  Thread tobj = new Thread(sobj);
		  tobj.start(); //MEMO tobjに入れないで、sobj.start();書いても同様に動く。
	
		  for (int i = 1; i <= 10; i++) {
			  System.out.println("人を乗せた鳥が飛ぶ"); 
			  try {
				  Thread.sleep(500);
			  } catch (InterruptedException e) {
				  
			  }
		  }
	  }
	}
