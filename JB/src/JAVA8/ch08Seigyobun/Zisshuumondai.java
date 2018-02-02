package JAVA8.ch08Seigyobun;

public class Zisshuumondai {
	public static void main(String[] args){
		
		//while文：先条件後処理、使用者が初期値指定
		
			int i = 1;
			int sum = 0;
	
			while(i < 11){
				sum += i;
				i += 1;
			}
			
			System.out.print(sum); 
		
			System.out.println(); 
			System.out.println(); 
			
		//do while文：先処理後条件、「最初に必ず１回は処理を行わせたい」場合使う
			
			int i2 = 1;
			int sum2 = 0;
			
			do{
				sum2 += i2;
				i2 += 1;
			}while(i2 < 11);
			
			System.out.print(sum2); 
			
			System.out.println(); 
			System.out.println(); 
			
			
		//for文で、配列内容の表示
			int[] hairetsu = {10, 20, 30, 40};
			for (int i3 = 0; i3 < hairetsu.length; i3++){ //MEMO 変数型指定忘れないように。
				System.out.print(hairetsu[i3]+" "); 
			}
			System.out.println(); 
			System.out.println(); 

			
		//for文で、二次元配列内容の表示
			int[][] nizigen = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
			for (int i4 = 0; i4 < nizigen.length; i4++){ //MEMO 二次元配列の「行」の数
				for (int j4 = 0; j4 < nizigen[i4].length; j4++){ //MEMO 二次元配列の「列」の数
					System.out.println(nizigen[i4][j4]); 
				}
			}
			
			System.out.println(); 

			
		//for文で、配列の要素の中で最大値を求めて表示
			int[] array = {1, 2, 3, 4, 5};
			int amax = 0;
			for(int i5 = 0; i5 < array.length; i5++){ //MEMO 仕組み：配列を順番に読みながら、もっと大きい数字を見つけるとそれが新しい最大値になる
				int chk = 0; //MEMO 変数chkのスコープはfor文のみなので、その中に宣言した方がいい。
				chk = array[i5];
				if(amax < chk){
					amax = chk;
				}
			}
			System.out.println(amax); 
			
			System.out.println(); 

			
		//for-each文（拡張for文）：式(配列、コレクション)の値を変数に取り出す。
			int prices [] = {2, 4, 6};
			for(int aprice : prices){
				System.out.println(aprice); 
			}
			
			System.out.println(); 

			
		//if-else文
			int seiseki = 99;
			String hantei = "";
			
			if (seiseki >= 80) {
				hantei = "優";
			} else if (seiseki >= 70){
				hantei = "良";
			} else if (seiseki >= 60){
				hantei = "可";
			} else {
				hantei = "不可";
			}	
			
			System.out.println(hantei); 
		
			System.out.println(); 
			
      }				
}
