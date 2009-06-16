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
    
    public void updatePosn() {
        this.isLanded();
        this.first.updatePosn();
        this.rest.updatePosn();
    }
    
    public boolean isLanded() {
        if (this.first.isLanded()) {
            IBombs removed = this.removeBomb(this.first);
            this.first = removed.first();
            this.rest = removed.rest();
        }
        return this.first.isLanded() || this.rest.isLanded();
    }
    
    public boolean hitsWalls(IShelters shelters) {
        if(this.first.hitsWalls(shelters)) {
            IBombs removed = this.removeBomb(this.first);
            this.first = removed.first();
            this.rest = removed.rest();
        }
        return this.first.hitsWalls(shelters) || this.rest.hitsWalls(shelters);
    }
    
    public Bomb first() {
        return this.first;
    }
    
    public IBombs rest() {
        return this.rest;
    }
    
    public IBombs removeBomb(Bomb bomb) {
        if (this.first.equals(bomb)) {
            return this.rest;
        }
        
        return new PairBomb(
            this.first,
            this.rest.removeBomb(bomb)
        );
    }

}
