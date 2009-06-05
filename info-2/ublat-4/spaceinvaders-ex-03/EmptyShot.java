import colors.*;
import draw.*;
import geometry.*;

// leere Liste von Schüssen
public class EmptyShot implements IShots{

    EmptyShot(){
    }

    public boolean draw(Canvas c){
        return true;
    }
}
