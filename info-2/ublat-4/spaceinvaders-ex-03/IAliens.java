import colors.*;
import draw.*;
import geometry.*;

// Eine Liste von Aliens
public interface IAliens {
    public boolean draw(Canvas c);
    public void updatePosn(); 
    public void setSpeed(Posn speed);
    public Alien lastElement();
    public int count();
    public void addY(int value);
    public boolean isLanded();
    public PairShot randomShot(PairShot shots);
}
