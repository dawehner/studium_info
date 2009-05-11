

// Klasse f�r - Operation
public class Minus  implements IExpression {
    IExpression leftExpr;
    IExpression rightExpr;
    
    Minus(IExpression leftExpr,IExpression rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }
    
    public double evaluate() {
        return leftExpr.evaluate() - rightExpr.evaluate();
    }
}
