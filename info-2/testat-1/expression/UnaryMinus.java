

// Klasse f�r Vorzeichenwechsel
public class UnaryMinus  implements IExpression {
    IExpression expression;
    
    UnaryMinus(IExpression expression) {
        this.expression = expression;
    }
    
    public double evaluate() {
        return -1 * expression.evaluate();
    }
}
