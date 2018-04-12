package sougouZisshuu.sigekiJava.ch12WrapperClass;

/*
【優子の情報出力】
	・自動Boxingの例示。
		・例示の150.6とtrueは、それぞれDouble型とBoolean型に自動Boxingされる。
		
	＊Boxing
		・Primitive型データをWrapper Objectに自動格納すること。反対概念はUnboxing。
*/
class LunchBox {

	public static void main(String[] args) {
		Object arr[] = new Object[5];
	
		arr[0] = "優子";
		arr[1] = new Integer(12);
		arr[2] = 150.6;
		arr[3] = new Character('A');
		arr[4] = true;
		
		for (int cnt = 0; cnt < arr.length; cnt++) {
			System.out.println(arr[cnt]);
		}
	}

}
