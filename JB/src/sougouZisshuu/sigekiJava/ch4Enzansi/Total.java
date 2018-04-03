package sougouZisshuu.sigekiJava.ch4Enzansi;

public class Total {

	public static void main(String[] args) {
		byte total = 0;
		
		for (int cnt = 0; cnt < 10; cnt++) {
			total = (byte) (total + cnt); //byte + int = intになるので、cast。
		}
		
		System.out.println(total);
	}

}
