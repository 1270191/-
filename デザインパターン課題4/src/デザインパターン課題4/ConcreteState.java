package デザインパターン課題4;

class TanoshiiState extends DogState {
private static TanoshiiState s = new TanoshiiState();
private TanoshiiState() {}
public static DogState getInstance() {
return s;
}
public void tukareta(Dog moto) {
moto.changeState(FutsuuState.getInstance());
}
public void tabeta(Dog moto) { // なにもしない
}
public String toString() {
return "楽しい状態";
}
}
class FutsuuState extends DogState {
private static FutsuuState s = new FutsuuState();
private FutsuuState() {}
public static DogState getInstance() {
return s;
}
public void tukareta(Dog moto) {
moto.changeState(IrairaState.getInstance());
}
public void tabeta(Dog moto) {
moto.changeState(TanoshiiState.getInstance());
}
public String toString() {
return "普通状態";
}
}
class IrairaState extends DogState {
private static IrairaState s = new IrairaState();
private IrairaState() {}
public static DogState getInstance() {
return s;
}
public void tukareta(Dog moto) {
// なにもしない
}
public void tabeta(Dog moto) {
moto.changeState(TanoshiiState.getInstance());
}
public String toString() {
return "いらいら状態";
}
}
class byoukizyoutai extends DogState {
private static byoukizyoutai s = new byoukizyoutai();
private byoukizyoutai() {}
public static DogState getInstance() {
return s;
}
public void tukareta(Dog moto) {
// なにもしない
}
public void tabeta(Dog moto) {
moto.changeState(TanoshiiState.getInstance());
}
public String toString() {
return "病気状態";
}
}