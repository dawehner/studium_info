

// Klasse für Speisewägen
public class EatRail implements IRail{
    int tables;
    int seats;
    EatRail(int tables) {
        this.tables = tables;
        this.seats = 4 * tables;
    }
}
