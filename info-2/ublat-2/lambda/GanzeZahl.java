

// Klasse für Ganze Zahlen.
public class GanzeZahl implements IBasisWert{
    int value;
    
    public boolean isBetaRedex() {
        return false;
    }
    
    public boolean isAbstraktion() {
        return false;
    }
    
    GanzeZahl(int value) {
        this.value = value;
    }
}
