package デザインパターン課題６;

import java.util.ArrayList;

abstract class Subject {
public ArrayList<Observer> observers;
Subject() {
observers = new ArrayList<Observer>();
}
public void attach(Observer o) {
observers.add(o);
}
public void detach(Observer o) {
observers.remove(1);
}
public void tsuuchi() {
for (Observer observer: observers) {
observer.update(this);
}
}
}