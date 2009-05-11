

// Klasse zur Berechnung des Maximums dreier Werte
public class Max implements IExpression {
    IExpression val1;
    IExpression val2;
    IExpression val3;
    
    Max(IExpression val1, IExpression val2, IExpression val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }
    
    public double max_single(double one, double two) {
        if (one > two) {
            return one;
        }
        else {
            return two;
        }
    }

    public double evaluate() {
        double val1_ = val1.evaluate();
        double val2_ = val2.evaluate();
        double val3_ = val3.evaluate();
        return max_single(max_single(val1_, val2_), val3_);
    }
}
