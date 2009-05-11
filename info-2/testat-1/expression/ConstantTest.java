

public class ConstantTest extends de.tuebingen.informatik.Test {
   IExpression exp1 = new Constant(3);
   IExpression exp2 = new Constant(0);
   
   @org.junit.Test
   public void evaluate() {
       checkExpect(exp1.evaluate(), 3.0);
       checkExpect(exp2.evaluate(), 0.0);
    }
}
