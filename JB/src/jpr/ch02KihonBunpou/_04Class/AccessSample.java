package jpr.ch02KihonBunpou._04Class;

//アクセス修飾字：カプセル化(データ・処理をクラス内に隠蔽)実現
class AccessSample { //MEMO クラスの定義には、publicまたは何もつけない、のどちらか。
	protected int val = 0;
	
	private void methodA(int i) {
		System.out.println(i * 10);
	}
	
	public static void main(String[] args){
		AccessSample as = new AccessSample();
		as.methodA(9);
	}
}
