package JAVA8.ch08Seigyobun;

//Switch文：式の真偽ではなく、「値」によって処理分岐。
public class Switch {

  public static void main(String[] args) {
    String color = "ミント";

    switch (color) {
      case "赤":
        System.out.println("止まれ");
        break;
      case "青":
        System.out.println("進め");
        break;        
      case "黄":
    	  	System.out.println("注意");
    	  	break;
    	  default: //MEMO いずれの式とも合致しない場合には、default部が処理される。
    		System.out.println("色が違います"); 
    }
  }
}
