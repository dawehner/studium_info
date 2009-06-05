import colors.*;
import draw.*;
import geometry.*;

// Ein Alien, dessen Position in seinem Zentrum liegt.
public class Alien extends AGameObject{

    Posn speed; // Geschwindigkeit in pixel, schön zum addieren
    
    Alien(Posn position, int velocity, Posn speed){
         super(new Red(), position, velocity);
         this.speed = speed;
    }    
    
    public boolean draw(Canvas c){
        return
            c.drawDisk(this.position, 8, this.colorGameObject)
            && c.drawRect(new Posn(this.position.x - 15, this.position.y - 2), 
                            30, 4, this.colorGameObject);
    }
    
    /**
     * @todo
     *   Needs testing.
     */
    public void SetSpeed(Posn speed) {
        this.speed = speed;
    }
    
    public void updatePosn() {
        this.position.x += this.speed.x;
        this.position.y += this.speed.y;
    }
}