package sougouZisshuu.sigekiJava.ch8PackageToAccessShuushokusi.zaikoKanri;

public class SmartGoodsStock extends GoodsStock {

	public SmartGoodsStock(String goodsCode, int stockNum) {
		super(goodsCode, stockNum);
	}
	
	@Override
	public int getRealStockNum() {
		return (int) (stockNum * 0.5);
		
	}
}
