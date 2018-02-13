package JPR.ch02KihonBunpou._03KihonKoubun2;

//Switch文
public class SwitchSample {

  public static void main(String[] args) {

    int value = 1;

    switch (value) {
      case 1:
        System.out.println("first");
      case 2: //MEMO Breakがないと、次に続くcase部が無条件に処理される(Fall Through)。
      case 3:
        System.out.println("second");
    }
  }
}
