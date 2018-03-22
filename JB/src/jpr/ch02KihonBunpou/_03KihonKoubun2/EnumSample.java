package jpr.ch02KihonBunpou._03KihonKoubun2;

//enum(列挙型)：
public class EnumSample {

  enum Signal {
    RED,
    BLUE,
    YELLOW;

    @Override
    public String toString() {
      return "信号の色は" + name(); //MEMO nameメソッドを実行すると「RED」値が戻ってくる理由は、Enum.classのJavadoc読めば分かる。
    }
  }

  public static void main(String[] args) {
    Signal s = Signal.RED;

    if (s != Signal.BLUE) {
      System.out.println("危険");
    }

    switch (s) {
      case RED:
      case YELLOW:
        System.out.println("停止"); //MEMO これが出力される理由：breakない時の「Fall Through」。
        break;
      default:
        break;
    }

    System.out.println(s.toString());
  }
}
