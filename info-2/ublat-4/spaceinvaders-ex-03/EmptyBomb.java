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
}
