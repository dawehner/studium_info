import colors.*;
import draw.*;
import geometry.*;

// Ein Paar von Bomben
public class PairBomb implements IBombs{

    Bomb first;
    IBombs rest;
    
    PairBomb(Bomb first, IBombs rest){
        this.first = first;
        this.rest = rest;
    }
    
    public boolean draw(Canvas c){
        return this.first.draw(c) && this.rest.draw(c);
    }
}
