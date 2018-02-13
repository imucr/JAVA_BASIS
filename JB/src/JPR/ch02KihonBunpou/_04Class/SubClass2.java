package JPR.ch02KihonBunpou._04Class;

/*
final：
	①メソッドのOverride禁止
	②クラスの継承禁止
 */
class SuperClass2 {
  void methodA(int i) {
    System.out.println(i);
  }

  final void methodB(int i) {
    System.out.println(i * 2);
  }
}

class SubClass2 extends SuperClass2 {

  @Override
  void methodA(int i) {
    System.out.println(i * 10);
  }

  public static void main(String[] args) {
    SubClass2 s2 = new SubClass2();
    s2.methodA(10); //MEMO「int i」って、また宣言する必要無し。
  }
}
