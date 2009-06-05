import colors.*;
import draw.*;
import geometry.*;

// Eine Bombe der Aliens. Zerstört die Kanone und die Schutzwälle.
public class Bomb extends AGameObject{
  
    Bomb(Posn position, int velocity){
        super(new Red(), position, velocity);
    }
    
    public boolean draw(Canvas c){
        return c.drawDisk(this.position, 6, this.colorGameObject);
    }
}
