import colors.*;
import draw.*;
import geometry.*;
import java.util.Random;

// Eine Bombe der Aliens. Zerstört die Kanone und die Schutzwälle.
public class Bomb extends AGameObject{
  
    Posn speed;

    Bomb(Posn position, int velocity){
        super(new Red(), position, velocity);
        this.speed = new Posn(0, 5);
    }
    
    public boolean draw(Canvas c){
        return c.drawDisk(this.position, 6, this.colorGameObject);
    }
    
    public void updatePosn() {
        this.position.x += this.speed.x;
        this.position.y += this.speed.y;

        
    }

    
    public boolean isLanded() {
        if (this.position.y > 400) {
            this.colorGameObject = new Black();
            return true;
        }
        return false;
    }
    
    public boolean hitsWalls(IShelters shelters) {
        return this.hitsWall(shelters.first()) || this.hitsWalls(shelters.rest());
    }
    
    public boolean hitsWall(Shelter shelt) {
        return this.hit(shelt);
    }
    
}
