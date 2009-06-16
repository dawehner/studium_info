import colors.*;
import draw.*;
import geometry.*;

// eine leere Liste von Alien
public class EmptyAlien implements IAliens{

    EmptyAlien(){
    }

   public boolean draw(Canvas c){
        return true;
    }
    
    public void updatePosn() {
    }
    
    public Alien lastElement() {
        return new Alien(new Posn(0, 0), 10, new Posn(1, 1));
    }
    
    /*public Alien firstElement() {
        return new EmptyAlien();
    }*/
    public void setSpeed(Posn speed) {
    }
    
    public int count() {
        return 0;
    }
    
    public void addY(int value) {
    }
    
    public boolean isLanded() {
        return false;
    }
    
    public PairShot randomShot(PairShot shots) {
        return shots;
    }
}
