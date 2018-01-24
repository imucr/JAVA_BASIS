package JAVA8.ch04DataHyougen;

public class Zisshuumondai {
	public static void main(String[] args){

		//文字に対応するユニコード出力		
			char ch_A='あ';
			char ch_I='い';
			char ch_U='う';
			char ch_E='え';
			char ch_O='お';
			
			int code_A= (int) ch_A;
			int code_I= (int) ch_I;
			int code_U= (int) ch_U;
			int code_E= (int) ch_E;
			int code_O= (int) ch_O;
			
			System.out.println(Integer.toHexString(code_A)); 
			System.out.println(Integer.toHexString(code_I) ); 
			System.out.println(Integer.toHexString(code_U) ); 
			System.out.println(Integer.toHexString(code_E) ); 
			System.out.println(Integer.toHexString(code_O) ); 

		//文字に対応するユニコードで、文字を表示			
			System.out.print('\u3042');
			System.out.print('\u3044');
			System.out.print('\u3046'); 
			System.out.print('\u3048'); 
			System.out.println('\u304a');
				//MEMO back slashは、MacではOptionキーを押しながら書かなければならない
				//MEMO 実際、ユニコードでは入出力しない。

		//文字に対応するユニコード出力			
			char char_Yo='よ';
			char char_U='う';
			char char_Ko='こ';
			char char_So='そ';
			char char_J='J';
			char char_a='a';
			char char_v='v';
			
			int int_Yo=(int) char_Yo; //MEMO cast int忘れるな！
			int int_U=(int) char_U;
			int int_Ko=(int) char_Ko;
			int int_So=(int) char_So;
			int int_J=(int) char_J;
			int int_a=(int) char_a;
			int int_v=(int) char_v;
			
			System.out.println(Integer.toHexString(int_Yo)); 
			System.out.println(Integer.toHexString(int_U)); 
			System.out.println(Integer.toHexString(int_Ko)); 
			System.out.println(Integer.toHexString(int_So)); 
			System.out.println(Integer.toHexString(int_J)); 
			System.out.println(Integer.toHexString(int_a)); 
			System.out.println(Integer.toHexString(int_v)); 
			System.out.println(Integer.toHexString(int_a)); 

		//ユニコードに対応する文字出力
			System.out.print('\u3088'); 
			System.out.print('\u3046'); 
			System.out.print('\u3053'); 
			System.out.print('\u305d'); 
			System.out.print('\u004a'); 
			System.out.print('\u0061'); 
			System.out.print('\u0076'); 
			System.out.print('\u0061'); 
			
	}
}
