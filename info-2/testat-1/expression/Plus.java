

// Klasse f�r + Operation
public class Plus implements IExpression{
    IExpression leftExpr;
    IExpression rightExpr;
    
    Plus(IExpression leftExpr,IExpression rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }
    
    public double evaluate() {
        return leftExpr.evaluate() + rightExpr.evaluate();
    }
}
