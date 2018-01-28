package JAVA8.ch07Hairetsu;

public class Zisshuumondai {
	
	public static void main(String[] args){
		
		//配列の宣言、生成、初期化
			int[] groupNo = {1, 2, 3, 4}; //MEMO 配列の宣言・生成・初期化を一括でする方法
			System.out.println(groupNo[0]);
			System.out.println(groupNo[1]); 
			System.out.println(groupNo[2]); 
			System.out.println(groupNo[3]); 
		
		//多次元配列の宣言、生成、初期化
			int[][] tajigen = {{10, 20, 400, 700}, {20, 200, 500, 800}, {30, 300, 600, 900}};
			System.out.println(tajigen[0][0]); 
						
	}
}
