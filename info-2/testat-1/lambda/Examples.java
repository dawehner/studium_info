

// Kurzbeschreibung
public class Examples {
  // (ßx.(x x))(ßx. (x x))

  ITerm x = new Variable("x");
  // Funktioniert aus irgendeinem nicht ersichtlichen Grund nicht.
  // ITerm term1 = new Applikation(new Abstraktion(x, new Applikation(x, x)), new Abstraktion(x, new Applikation(x, x)));
  
  // (ßx.(ßy.(y))) 1 2
  ITerm y = new Variable("y");
  ITerm one = new GanzeZahl(1);
  ITerm two = new GanzeZahl(2);
  //  ITerm term2 = new Applikation(new Applikation(new Abstraktion(x, new Abstraktion(y, y)), one), two);
  
  // (((ßx.(ßy.(x y))) (ßx.(x x))(ßx. (x x))) (ßx.(ßy.(y))) 1 2)
   ITerm term3 = new Applikation(
   /** new Applikation(
      new Abstraktion(x, new Abstraktion(y, new Applikation(x, y))),
      new Applikation(new Abstraktion(x, new Applikation(x, x)), new Abstraktion(x, new Applikation(x, x)))),
    new Applikation(new Applikation(new Abstraktion(x, new Abstraktion(y, y)), one), two)); */
}