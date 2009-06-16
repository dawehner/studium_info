

// Klasse für CopyCard
public class CopyCard extends AMoneyCard implements ICopyCard{
    
    CopyCard(String name, int id, IMoneyCard moneycard) {
        super(name, id, moneycard);
    }

    public void copy(int seiten) {
        this.moneycard.setGuthaben(
            this.moneycard.getGuthaben() -
            0.04 * seiten
        );
    }
}
