package デザインパターン課題６;

class NishinHyouji implements Observer {
public void update(Subject s) {
print(((Suuchi)s).getValue());
}
private void print(int n) {
System.out.println( n + "を2 進数で表示します");
//
// ここに2 進数表示処理を作成する
//
}
}
class JyuurokushinHyouji implements Observer {
public void update(Subject s) {
print(((Suuchi)s).getValue());
}
private void print(int n) {
System.out.println(n + "を 16 進数で表示します");
//
// ここに 16 進数表示処理を作成する
//
}
}