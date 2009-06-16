import colors.*;
import draw.*;
import geometry.*;

// Bomben der Aliens
public interface IBombs {
    boolean draw(Canvas c);
    public void updatePosn();
    public boolean isLanded();
    public boolean hitsWalls(IShelters shelters);
    public IBombs removeBomb(Bomb bomb);
    public Bomb first();
    public IBombs rest();
}
