package sougouZisshuu.sigekiJava.ch9KisotekinaJavaClass;

import java.util.*;

/*
【今日から100日後の日付を計算】
	・日に100を足して、年、月、日を出力。
	・Java基礎APIの一つのGregorianCalendar使用の例示。
*/
class After100Days {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.add(Calendar.DATE, 100);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; //QUESTION こうしなければ、一ヶ月前の月が出てしまう。理由？
		int date = calendar.get(Calendar.DATE);
		
		System.out.printf(year + "年" + month + "月" + date + "日");
	}

}
