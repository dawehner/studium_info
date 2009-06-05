import colors.*;
import draw.*;
import geometry.*;

// ein Paar aus Aliens
public class PairAlien implements IAliens{

    Alien first;
    IAliens rest;
    
    PairAlien(Alien first, IAliens rest){
        this.first = first;
        this.rest = rest;
    }
    
    public boolean draw(Canvas c){
        return 
            this.first.draw(c) && this.rest.draw(c);
    }
    
    public void updatePosn() {
        // wenn erster alien zu weit links ist
        if (this.firstElement().position.x < 10 || this.lastElement().position.x > 490) {
            Posn new_speed = new Posn(-1 * this.first.speed.x, this.first.speed.y);
            this.setSpeed(new_speed);
        }
        
        // wenn letzer alien zu weit rechts ist dann update speed und pos
        this.first.updatePosn();
        this.rest.updatePosn();
    }
    
    public void setSpeed(Posn speed) {
        this.first.setSpeed(speed);
        this.rest.setSpeed(speed);
    }
    
    public void setPosition(Posn speed) {
        this.first.SetSpeed(speed);
        this.rest.SetSpeed(speed);
    }
    
    public IAlien lastElement() {
        if (this.rest.equals(new EmptyAlien())) {
            return this.first;
        }
        else {
            return this.rest.lastElement();
        }
    }
    
    public IAlien firstElement() {
        return this.first;
    }
}
