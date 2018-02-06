package JAVA8.ch09ClassToObject;


/*
Instanceメンバ：
	対象クラスのオブジェクト(Instance)生成後、アクセス可
*/

class InstanceMember03a {
	int[] groupNo = {1, 2, 3, 4, 5};
}

class InstanceMember03b{
	String[] groupName = new String[]{"うさぎ", "亜美", "レイ", "誠", "美奈子"}; //QUESTION Stringはクラスなので、newつける？
}


public class InstanceMember03 {

  public static void main(String[] args) {
	  InstanceMember03a obj_a = new InstanceMember03a();
	  InstanceMember03b obj_b = new InstanceMember03b();
	  
	  System.out.println("会員番号　会員名");
	  for (int i = 0; i<obj_a.groupNo.length; i++){
		  System.out.println( obj_a.groupNo[i] + "	" + obj_b.groupName[i] ); 
	  }
  }
}
