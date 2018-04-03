package sougouZisshuu.sigekiJava.ch5ObjectToClass;

public class GoodsInfo {

	String code;
	String name;
	String maker;
	int price;
	double discountRate;
	
	GoodsInfo(String code, String name, String maker, int price) {
		this.code = code;
		this.name = name;
		this.maker = maker;
		this.price = price;	
	}
	
	GoodsInfo(String code, String name, String maker, int price, double discountRate) {
		this(code, name, maker, price);
		this.discountRate = discountRate;
	}
	
	void updateDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	int getSellingPrice() {
		return price - (int) (price * discountRate);
	}
	
	public static void main(String[] args) {
		GoodsInfo gi = new GoodsInfo("1234", "ドラえもん", "小学館", 1000, 0.2); //QUESTION GoodsInfoだけ書けない理由？
		System.out.println(gi.name + "の販売価格は" + gi.getSellingPrice() + "円です。"); //QUESTION nameだけ書けない理由？
	}
	
	
}
