import colors.*;
import draw.*;
import geometry.*;

// Eine Liste von Aliens
public interface IAliens {
    public boolean draw(Canvas c);
    public void updatePosn(); 
    public void setSpeed(Posn speed);
}
