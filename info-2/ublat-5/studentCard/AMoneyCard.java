

// Kurzbeschreibung
public abstract class AMoneyCard {
    String name;
    int id;
    IMoneyCard moneycard;
    
    AMoneyCard(String name, int id, IMoneyCard moneycard) {
        this.name = name;
        this.id = id;
        this.moneycard = moneycard;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getId() {
        return this.id;
    }
    
    public IMoneyCard getMoneycard() {
        return this.moneycard;
    }
}
