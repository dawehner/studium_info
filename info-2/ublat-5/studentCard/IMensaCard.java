

// Interface für Mensakarte
public interface IMensaCard{

    public void eatMainMenu();
    public void eatSalad(double weight);
    
    public String getName();
    public int getId();
    public IMoneyCard getMoneycard();
}
