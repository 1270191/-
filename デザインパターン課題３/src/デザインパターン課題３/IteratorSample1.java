package デザインパターン課題３;



public class IteratorSample1 {
public static void main(String[] args) {
BookListAggregate BookListAggregate = new BookListAggregate();
Iterator iterator = BookListAggregate.createIterator();
BookListAggregate.add(new BookList("みんなでゴルフ", 3700));
BookListAggregate.add(new BookList("ファイナルファンタジア", 7300));
BookListAggregate.add(new BookList("ロケットモンスター", 5400));
BookListAggregate.add(new BookList("サイコロの達人", 5200));
iterator.first(); // まず探す場所を先頭位置にしてもらう
while ( ! iterator.isDone() ) { // まだある？ まだあるよ！
BookList book = (BookList)iterator.getItem(); // はいどうぞ (と受取る)
System.out.println( book.getName());
iterator.next(); // 次を頂戴
}
}
}