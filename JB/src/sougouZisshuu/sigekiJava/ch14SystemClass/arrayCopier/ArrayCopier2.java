package sougouZisshuu.sigekiJava.ch14SystemClass.arrayCopier;

/*
【配列コピー２】
	・Systemクラスのarraycopierメソッドを使っている場合の例示。
*/
class ArrayCopier2 {

	public static void main(String[] args) {
		double arr1[] = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
		double arr2[] = new double[5];
		
		System.arraycopy(arr1, 2, arr2, 0, 5);
		
		for(double num : arr2) {
			System.out.println(num);
		}
	}

}
