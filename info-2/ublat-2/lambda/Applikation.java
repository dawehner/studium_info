

// Eine Applikation besteht aus zwei Termen welche aufeinander angewandt werden.
public class Applikation implements ITerm {
    ITerm term1;
    ITerm term2;
      
    public boolean isAbstraktion() {
        return false;
    }
  
    public boolean isBetaRedex(
        if (this.term1.isAbstraktion()) {
            return true;
        }
        else {
            return false;
        }
    );


    Applikation(ITerm term1, ITerm term2) {
        this.term1 = term1;
        this.term2 = term2;
    }
}
