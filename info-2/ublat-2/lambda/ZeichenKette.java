

// Kurzbeschreibung
public class ZeichenKette implements IBasisWert{
    String value;
    
    public boolean isBetaRedex() {
        return false;
    }
    
    public boolean isAbstraktion() {
        return false;
    }
  
    ZeichenKette(String value) {
        this.value = value;
    }
}
