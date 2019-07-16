package デザインパターン課題３;

class BookListAggregate implements Aggregate {
private BookList[] list = new BookList[20];
private int numberOfStock;
@Override
public Iterator createIterator() {
return new BookListIterator(this);
}
public void add(BookList book) {
list[numberOfStock] = book;
numberOfStock += 1;
}
public Object getAt(int number) {
return list[number];
}
public int getNumberOfStock() {
return numberOfStock;
}
}