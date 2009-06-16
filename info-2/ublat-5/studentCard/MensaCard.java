

// Kurzbeschreibung
public class MensaCard extends AMoneyCard implements IMensaCard{

    MensaCard(String name, int id, IMoneyCard moneycard) {
        super(name, id, moneycard);
    }

    public void eatMainMenu() {
        double menu_const = 2.70;
        this.moneycard.setGuthaben(
            this.moneycard.getGuthaben() -
            menu_const
        );
    }
    
        
    // gewicht in gramm
    public void eatSalad(double weight) {
        double salad_const = 0.85;
        double money = (weight / 100) * salad_const;
        
        this.moneycard.setGuthaben(
            this.moneycard.getGuthaben() -
            money
        );
    }
}
