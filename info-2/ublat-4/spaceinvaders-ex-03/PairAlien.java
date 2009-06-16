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
        
        if (this.firstElement().position.x < 10 && this.first.speed.x < 0) {
            Posn new_speed = new Posn(- 1 * this.first.speed.x, this.first.speed.y);
            this.addY(20);
            this.setSpeed(new_speed);
        }
        else if(this.lastElement().position.x > 490 && this.first.speed.x > 0) {
            Posn new_speed = new Posn(-1 * this.first.speed.x, this.first.speed.y);
            this.addY(20);
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
        this.first.setSpeed(speed);
        this.rest.setSpeed(speed);
    }
    
    public void addY(int value) {
        this.first.addY(value);
        this.rest.addY(value);
    }
    
    public Alien lastElement() {
        if (this.rest.count() == 0) {
            return this.first;
        }
        else {
            return this.rest.lastElement();
        }
    }
    
    public Alien firstElement() {
        return this.first;
    }
    
    public int count() {
        return 1+ this.rest.count();
    }
    
    public boolean isLanded() {
        return this.first.isLanded() || this.rest.isLanded();
    }
    
    public PairShot randomShot(PairShot shots) {
        return shots;
    }

}
