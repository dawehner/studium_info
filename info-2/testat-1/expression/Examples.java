

// Beispiele
public class Examples {
    //Das Beispiel aus b)
    IExpression exp1 = new Minus(new Minus(new Plus(new Constant(4),
                                                    new Constant(-3)),
                                           new Constant(1)),
                                 new UnaryMinus(new Constant(42)));
   //nicht ganz so dämliche Beispiele
   IExpression exp2 = new UnaryMinus(new Constant(0));
   IExpression exp3 = new Constant(3);
   
   
   //eigene Uhrzeit-klasse
   //   IExpression time1 = new AdvancedConstant(18, 10, 32);  //es ist 18.32 Uhr 
   
   IExpression exp4 = new Max(exp1, exp2, exp3);
   
   // Teilaufgabe d)
   IExpression exp5 = new Plus(new Constant(12), new Constant(30));
   IExpression exp6 = new Minus(new Constant(12), new UnaryMinus(new Constant(30)));
   IExpression exp7 = new Max(new Constant(42), new Constant(23), new Constant(21));
   
}
