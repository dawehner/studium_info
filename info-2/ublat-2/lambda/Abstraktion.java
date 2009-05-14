

// eine Abstraktion besteht aus einer variable und einem Term.
public class Abstraktion implements ITerm{
    Variable variable;
    ITerm term;
  
    public boolean isBetaRedex() {
        return false;
    }
    
    public boolean isAbstraktion() {
        return true;
    }

    Abstraktion(Variable variable, ITerm term) {
        this.variable = variable;
        this.term = term;
    }
}
