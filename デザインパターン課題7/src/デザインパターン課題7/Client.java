package デザインパターン課題7;

public class Client {
public static void main(String[] args) {
Dengen d;
d = new AcAdapter();
int denatsu = d.kyuuden();
System.out.println( denatsu + "V で給電されています" );
}
}