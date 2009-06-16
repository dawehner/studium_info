

// Klasse für MoneyKarte
public class oldMoneyCard implements IMoneyCard{
    double guthaben;
    
    oldMoneyCard(double guthaben) {
        this.guthaben = guthaben;
    }
    
    public double getGuthaben() {
        return this.guthaben;
    }
    
    public IMoneyCard setGuthaben(double guthaben) {
        return new oldMoneyCard(
            guthaben
        );
    }
}
