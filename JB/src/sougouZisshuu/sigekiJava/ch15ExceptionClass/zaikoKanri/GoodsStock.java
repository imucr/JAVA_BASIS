package sougouZisshuu.sigekiJava.ch15ExceptionClass.zaikoKanri;

class GoodsStock {

	String goodsCode;
	int stockNum;
	
	GoodsStock(String code, int num) {
		goodsCode = code;
		stockNum = num;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}
	
	int subtrackStock(int amount) throws StockShortageException {
		if (stockNum < amount) {
			throw new StockShortageException("在庫不足です。");			
		}
		
		stockNum -= amount;
		return amount;
	}
}
