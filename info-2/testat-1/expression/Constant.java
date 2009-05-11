

// Klasse f�r Konstanten
public class Constant  implements IExpression{
    double value;
    
    Constant(double value) {
        this.value = value;
    }
    
    public double evaluate() {
        return this.value;
    }
}
