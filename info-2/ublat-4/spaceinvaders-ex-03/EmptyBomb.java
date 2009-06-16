import colors.*;
import draw.*;
import geometry.*;

// Eine leere Liste von Bomben
public class EmptyBomb implements IBombs{

    EmptyBomb(){
    }

    public boolean draw(Canvas c){
        return true;
    }
    
    public void updatePosn() {
    }
    
    public boolean isLanded() {
        return false;
    }
    
    public IBombs removeBomb(Bomb bomb) {
        return this;
    }
    
    public Bomb first() {
        return new Bomb(new Posn(0, 0), 10);
    }
    
    public IBombs rest() {
        return this;
    }
    
    public boolean hitsWalls(IShelters shelters) {
        return false;
    }
}
