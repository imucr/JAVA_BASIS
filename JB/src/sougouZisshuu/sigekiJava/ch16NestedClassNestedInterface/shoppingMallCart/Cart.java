package sougouZisshuu.sigekiJava.ch16NestedClassNestedInterface.shoppingMallCart;

import java.util.ArrayList;

class Cart {
	ArrayList<Item> list = new ArrayList<>();
	
	void addItem(String name, int num, int unitPrice) {
		list.add(new Item(name, num, unitPrice));
			//MEMO name、num、unitPriceなど複数の項目を、Index一つで取り扱うことができる。
	}
	
	void removeItem(int index) {
		list.remove(index);
	}
	
	int getItemNum() {
		return list.size();
	}

	Item getItem(int index) {
		return list.get(index);
	}
	
	int getTotalPrice() {
		int total = 0;
		for (Item item : list) {
			total += item.getPrice();
		}
		
		return total;
	}
	
	void changeItemNumber(int index, int num) {
		Item item = list.get(index); //★
		item.num = num;
	}
	
	class Item {
		String name;
		int num;
		int unitPrice;
		
		Item(String name, int num, int unitPrice) {
			this.name = name;
			this.num = num;
			this.unitPrice = unitPrice;
		}
		
		int getPrice() {
			return num * unitPrice;
		}
	}
	
}
