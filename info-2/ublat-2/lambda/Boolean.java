

// Klasse für Booleans
public class Boolean implements IBasisWert{
    boolean value;
    
    public boolean isBetaRedex() {
        return false;
    }

    public boolean isAbstraktion() {
        return false;
    }
  
    Boolean (boolean value) {
        this.value = value;
    }
}
