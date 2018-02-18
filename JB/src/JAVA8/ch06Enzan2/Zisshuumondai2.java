package java8.ch06Enzan2;

public class Zisshuumondai2 {

  public static void main(String[] args) {

	  //条件演算：制御文に比べて、表現が簡略
		  int number = 8;
		  String hantei = ((number % 2) == 0 ? "偶数" : "奇数");
		  System.out.println(number+"は"+hantei+"です。");
	  
	  //条件演算：if-else文みたいに使う方法
		  int count = 80;
		  String hantei2 = "";
		  hantei2 = (count >= 80 ? "優" : hantei2);
		  hantei2 = (80 > count & count > 70 ? "良" : hantei2);
		  hantei2 = (70 > count ? "可" : hantei2);
		  System.out.println(hantei2); 
		  
	  //cast: 左辺の型に、右辺の型を合わせる
		  double pi = 3.14159256;
		  int integerPart = (int)pi;
		  double afterDecimal = pi - (double)integerPart;
		  System.out.println("整数部分 = "+integerPart);
		  System.out.println("小数点以下 = "+afterDecimal);
		  
  }
}
