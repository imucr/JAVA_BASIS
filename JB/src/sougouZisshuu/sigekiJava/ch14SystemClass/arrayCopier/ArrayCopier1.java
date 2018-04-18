package sougouZisshuu.sigekiJava.ch14SystemClass.arrayCopier;

/*
【配列コピー】
	・Systemクラスのarraycopierメソッドを使っていない場合の例示。
*/
class ArrayCopier1 {

	public static void main(String[] args) {
		double arr1[]  = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
		double arr2[] = new double[5];
		
		for(int cnt = 0; cnt < 5; cnt++) {
			arr2[cnt] = arr1[cnt + 2];
		}
		
		for(double num : arr2) {
			System.out.println(num);
		}

}

}