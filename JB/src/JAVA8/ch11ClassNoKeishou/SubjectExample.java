package JAVA8.ch11ClassNoKeishou;

//Overrideの例示：親クラスの処理に内容を追加する場合
class Subject {
	String name;
	
	void printInfo(){
		System.out.println("科目名：" + name); 
	}
}

class MajorSubject extends Subject {
	String targetGrader;
	
	void printInfo(){
		super.printInfo();
		System.out.println("対象学年：" + targetGrader); 
	}
}

class SubjectExample {
	public static void main(String args[]){
		MajorSubject sub = new MajorSubject();
		sub.name = "Java Programming";
		sub.targetGrader = "2年生";
		sub.printInfo();
	}


}
