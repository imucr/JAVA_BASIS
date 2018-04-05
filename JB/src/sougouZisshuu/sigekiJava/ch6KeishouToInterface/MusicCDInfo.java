package sougouZisshuu.sigekiJava.ch6KeishouToInterface;

//【CD情報出力】：親クラスのコンストラクタの継承の例示
class CDInfo {
	static byte lastRegisterNo;
	byte registerNo;
	String title;
	
	public CDInfo(String title) {
		this.registerNo = ++lastRegisterNo;
		this.title = title;
	}
}

public class MusicCDInfo extends CDInfo {
	String artist;
	String songName;
	
	public MusicCDInfo(String title, String artist, String songName) {
		super(title);
		this.artist = artist;
		this.songName = songName;		
	}

	void print () {
		System.out.println(registerNo + " " + title + " " + artist + " " + songName);
			//MEMO CDInfoクラスが継承されているので、CDInfo.registerNoでなくていい。
		System.out.println();
	}
	
	public static void main (String[] args) {
		MusicCDInfo mci = new MusicCDInfo("傑作選", "ベートーヴェン", "アリア");
		mci.print();
		
		MusicCDInfo mci2 = new MusicCDInfo("80年代人気歌謡選", "松田聖子", "青い珊瑚礁");
		mci2.print();
	}
}
