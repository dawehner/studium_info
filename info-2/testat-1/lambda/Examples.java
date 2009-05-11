

// Kurzbeschreibung
public class Examples {
  // (ßx.(x x))(ßx. (x x))

  ITerm x = new Variable("x");
  ITerm term1 = new Applikation(
    new Abstraktion(x, new Applikation(x x)),
    new Abstraktion(x, new Applikation(x x))
  );
  
  // (ßx.(ßy.(+ y))) 1 2
  ITerm y = new Variable("y");
  ITerm one = new GanzeZahl(1);
  ITerm two = new GanzeZahl(2);
//  ITerm term2 = new 
}
