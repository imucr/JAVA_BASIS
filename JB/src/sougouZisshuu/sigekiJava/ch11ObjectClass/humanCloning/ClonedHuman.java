package sougouZisshuu.sigekiJava.ch11ObjectClass.humanCloning;

/*
【人間複製】
	・英語と数学の点数まで同じ複製人間を作る。
	・Objectクラスのcloneメソッドの例示。
*/
class ClonedHuman {

	public static void main(String[] args) {
		Human obj1 = new Human(10, 20);
		Human obj2 = (Human) obj1.clone();

		System.out.println("複製されたばかりのobj2。");
		System.out.println("obj1 = " + obj1);
		System.out.println("obj2 = " + obj2 + "\n");
		
		obj2.setX(30);
		obj2.setY(40);
		
		System.out.println("複製されてから一か月後のobj2。オリジナルより頭いいみたいです。");
		System.out.println("obj1 = " + obj1);
		System.out.println("obj2 = " + obj2);
	}

}
