package デザインパターン課題;

public class SingletonTest {
public static void main(String[] args) {
TsuuchouS tsuuchou1 = TsuuchouS.getInstance();
tsuuchou1.torihiki(500);
tsuuchou1.print();
TsuuchouS tsuuchou2 = TsuuchouS.getInstance();
tsuuchou2.torihiki(300);
tsuuchou2.print();
//TsuuchouS tsuuchou3 = new TsuuchouS(); これはエラー
if (tsuuchou1 == tsuuchou2)
System.out.println("通帳1 と2 は同じインスタンス");
else
System.out.println("通帳1 と2 は別のインスタンス");
}
}
class Renban {
private static Renban jittai = new Renban();
private String code;
private String namae;
private int yokingaku;
private Renban() {
this.code = "101-18875";
this.namae = "山田太郎";
}
public static Renban getNumber() {
return jittai;
}
public void torihiki(int kingaku) {
yokingaku += kingaku;
}
public void print() {
System.out.println("+-----------------------------+");
System.out.println("口座番号：" + code);
System.out.println("氏名：" + namae);
System.out.println("預金残高：" + yokingaku);
}
}