package デザインパターン課題7;

class AcAdapter extends JapaneseConsent
implements Dengen { // Adapter
public int kyuuden() {
return (int)(power() * 0.16);
}
}