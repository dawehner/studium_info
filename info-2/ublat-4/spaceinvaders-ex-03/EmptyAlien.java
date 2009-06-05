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
    
    public IAlien lastElement() {
        return this;
    }
    
    public IAlien firstElement() {
        return new EmptyAlien();
    }
    
    public void setSpeed(Posn speed) {
    }
}
