package sougouZisshuu.sigekiJava.ch16NestedClassNestedInterface.animalCry;

/*
【犬を泣かせる】
	・普通の継承の例示。
*/
class Dog extends Animal {

	@Override
	void say() {
		System.out.println("ワン！ワン！");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.say();
	}
	
}
