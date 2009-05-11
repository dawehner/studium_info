

public class UnaryMinusTest extends de.tuebingen.informatik.Test {
   IExpression exp1 = new UnaryMinus(new Constant(1));
   IExpression exp2 = new UnaryMinus(new Minus(new Constant(1), exp1));
   
   @org.junit.Test
   public void evaluate() {
       checkExpect(exp1.evaluate(), -1.0);
       checkExpect(exp2.evaluate(), -2.0);
    }
}
