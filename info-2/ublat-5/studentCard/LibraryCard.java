

// Klasse für Bibliothekskarte
public class LibraryCard implements ILibraryCard {

    String name;
    int id;
    IMoneyCard moneycard;
    
    LibraryCard(String name, int id, IMoneyCard moneycard) {
        this.name = name;
        this.id = id;
        this.moneycard = moneycard;
    }
    
    public boolean isCardValid() {  
        return true;
    }
}
