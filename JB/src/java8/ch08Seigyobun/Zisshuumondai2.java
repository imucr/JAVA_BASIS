package java8.ch08Seigyobun;

public class Zisshuumondai2 {

  public static void main(String[] args) {

	  //break
		  int groupNo[] = {3, 1, -4, 5, 0, 9, 2};
		  
		  for(int i = 0; i<groupNo.length; i++){
			  if(groupNo[i] == 0){
				  break;
			  }
			  System.out.print(groupNo[i]+" "); 
		  }

  }
}
