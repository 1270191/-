package デザインパターン課題３;



public class IteratorSampleX {
public static void main(String[] args) {
BookList glist = new BookList(20);
glist.add(new BookList("スーパーロケット対戦", 10800));
glist.add(new BookList("サムライスピリチュアル", 7800));
glist.add(new BookList("デイズゴローン", 5900));
// ゲームを取出して名称表示（本来は任意の位置から取り出し可能）
for (int i = 0; i < glist.getNumberOfStock(); i++) {
System.out.println( glist.getBook(i).getName());
}
}
}