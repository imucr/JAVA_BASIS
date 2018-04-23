package sougouZisshuu.sigekiJava.ch16NestedClassNestedInterface.animalCry;

/*
【鶏を泣かせる】
	・メソッドの中のinner classと、匿名inner classの例示。
	
	＊①、②：
		・継承した内容が特定のメソッドの中でしか必要になる時、いっそそのクラスをメソッドの中に入れる。
*/
public class ChickenFarm {

	public static void main(String[] args) {
		
		//①　メソッドの中のinner class
		class Cock1 extends Animal {

			@Override
			void say() {
				System.out.println("cock-a-doodle");
			}
			
		}
		
		//②　匿名inner class（①の簡略化バージョン）
		Animal cock2 = new Animal() {

			@Override
			void say() {
				System.out.println("こけっこっこう");
			}
			
		};
		
		
		Cock1 c1 = new Cock1();
		c1.say();
		
		cock2.say();
	}

}
