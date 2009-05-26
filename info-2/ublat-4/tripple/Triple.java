

// Klasse für Tripples aus Ganzzahlen
public class Triple {
    int first;
    int second;
    int third;
    
    Triple(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    // ist das erste elemente zwischen den beiden anderen
    public boolean firstBetween() {
        return ((first < second) && (first > third)) || ((first > second) && (first < third));
    }
    
    // ist das erste element ein minimum oder nicht
    public boolean firstMinMax() {
        return ((first < second) && (first < third)) || ((first > second) && (first > third));
    }
    
    // ist die zweite oder dritte zahl durch die erste teilbar
    public boolean teilbarFirst() {
        return ((second % first) == 0) || ((third % first) == 0);
    }
    
    public boolean nr4() {
        return ((this.first % 2 == 0) || !this.isPrim());
    }
    
    // stellt fest ob eine zahl eine primzahl ist.
    public boolean isPrim() {
        for (double i = 1; i < Math.round(Math.sqrt(this.first)); i++) {
            i++;

            if ((this.first % i == 0)) {
                return false;
            }
        }
        return true;
    }
}
