

public class MinusTest extends de.tuebingen.informatik.Test {
   IExpression exp1 = new Minus(new Constant(1), new Constant(1));
   IExpression exp2 = new Minus(new Constant(2), new Minus(new Constant(1), exp1));
   
   @org.junit.Test
   public void evaluate() {
       checkExpect(exp1.evaluate(), 0.0);
       checkExpect(exp2.evaluate(), 1.0);
    }
}
