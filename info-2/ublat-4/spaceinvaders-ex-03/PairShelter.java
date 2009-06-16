import colors.*;
import draw.*;
import geometry.*;

// ein Paar von Schutzwällen
public class PairShelter implements IShelters{

    Shelter first;
    IShelters rest;
    
    PairShelter(Shelter first, IShelters rest){
        this.first = first;
        this.rest = rest;
    }

    public boolean draw(Canvas c){
        return this.first.draw(c) && this.rest.draw(c);
    }    
    
    public Shelter first() {
        return this.first;
    }
    public IShelters rest() {
        return this.rest;
    }
}
