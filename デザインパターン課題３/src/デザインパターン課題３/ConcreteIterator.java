package デザインパターン課題３;

class BookListIterator implements Iterator {
private BookListAggregate aggregate;
private int current;
public BookListIterator(BookListAggregate aggregate) {
this.aggregate = aggregate;
}
@Override
public void first() {
current = 0;
}
@Override
public void next() {
current += 1;
}
@Override
public boolean isDone() {
if (current >= aggregate.getNumberOfStock()) {
return true;
}
else {
return false;
}
}
@Override
public Object getItem() {
return aggregate.getAt(current);
}
}