

public class MaxTest extends de.tuebingen.informatik.Test {
   IExpression exp1 = new Max(new Constant(1.0), new Constant(2.0), new Constant(3.0));
   IExpression exp2 = new Plus(new Constant(1), new Constant(1));
   IExpression exp3 = new Minus(new Constant(2), new UnaryMinus(new Constant(2)));
   IExpression exp4 = new Max(exp1, exp2, exp3);
   
   @org.junit.Test
   public void evaluate() {
       checkExpect(exp1.evaluate(), 3.0);
       checkExpect(exp4.evaluate(), 4.0);
    }
    
}
