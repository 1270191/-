package デザインパターン課題６;

class Suuchi extends Subject {
int suuchiState;
int atai;
public int getState() {
return suuchiState;
}
public void putValue(int atai) {
if (atai > this.atai) {
this.atai = atai;
this.tsuuchi();
}
else { // 本来ここから3 行は不要となる行です。
System.out.println("確認用メッセージ:更新してません");
}
}
public int getValue() {
return atai;
}
}