import colors.*;
import draw.*;
import geometry.*;

// leere Liste von Schutzwällen
public class EmptyShelter implements IShelters{

    EmptyShelter(){
    }
    
    public boolean draw(Canvas c){
        return true;
    }
    
    
    public Shelter first() {
        return new Shelter(0, 0, 0);
    }
    public IShelters rest() {
        return this;
    }
}
