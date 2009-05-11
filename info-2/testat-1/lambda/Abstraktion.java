

// eine Abstraktion besteht aus einer variable und einem Term.
public class Abstraktion implements ITerm{
  Variable variable;
  ITerm term;

  Abstraktion(Variable variable, ITerm term) {
      this.variable = variable;
      this.term = term;
    }
}
