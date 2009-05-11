

public class PlusTest extends de.tuebingen.informatik.Test {
   IExpression exp1 = new Plus(new Constant(1), new Constant(1));
   IExpression exp2 = new Plus(new Constant(2), new Plus(new Constant(1), exp1));
   
   @org.junit.Test
   public void evaluate() {
       checkExpect(exp1.evaluate(), 2.0);
       checkExpect(exp2.evaluate(), 5.0);
    }
}
