import colors.*;
import draw.*;
import geometry.*;

// ein Paar von Schüssen
public class PairShot implements IShots{
    
    Shot first;
    IShots rest;
    
    PairShot(Shot first, IShots rest){
        this.first = first;
        this.rest = rest;
    }
    
    public boolean draw(Canvas c){
        return this.first.draw(c) && this.rest.draw(c);
    }
}
