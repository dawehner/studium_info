

// Eine Variable steht aus dem Namen der Variable
public class Variable implements ITerm{
    String variablenamen;
   
    public boolean isBetaRedex() {
        return false;
    }
    
    public boolean isAbstraktion() {
        return false;
    }

    Variable(String variablenamen) {
        this.variablenamen = variablenamen;
    }
}
