package sougouZisshuu.sigekiJava.ch5ObjectToClass;

//【四角形の面積計算】：インスタンス化の時のパラメータの制限、privateなデータを取り出すためのGetメソッド使用の例示
class Rectangle {
	private int width, height;
		//オブジェクトの外部から値を指定できないようにする。
		//privateなwidthとheightの値を外部から得るには下段のgetメソッドを使えばいい。
	
	public Rectangle(int width, int height) throws Exception {
		if (width <= 0 || height <= 0) throw new Exception("高さと幅は正数でなければなりません。");
			//widthとheightの値が0以下にならないようにする
		this.width = width;
		this.height = height;	
	}
	
	int getArea() {
		return width * height;
	}
	
	int getWidth() {
		return width;
	}
	
	int getHeight() {
		return height;
	}
}

public class Keisan {
	public static void main (String[] args) {
		Rectangle rt = null;
		
		try {
			rt = new Rectangle(4, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("四角形の面積：" + rt.getArea());
		System.out.println("幅：" + rt.getWidth());
		System.out.println("高さ：" + rt.getHeight());
	}
}