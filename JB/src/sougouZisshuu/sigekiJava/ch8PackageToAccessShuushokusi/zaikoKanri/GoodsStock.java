package sougouZisshuu.sigekiJava.ch8PackageToAccessShuushokusi.zaikoKanri;

public class GoodsStock {
	public String goodsCode;
	protected int stockNum;
	
	public GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}
	
	int subtractStock(int amount) throws Exception {
		if (stockNum < amount) {
			throw new Exception("在庫不足です。");
		}
		
		stockNum -= amount;
		return amount;
	}
	
	public int getRealStockNum() {
		return stockNum;
	}
}
