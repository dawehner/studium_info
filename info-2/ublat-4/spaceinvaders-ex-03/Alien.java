import colors.*;
import draw.*;
import geometry.*;
import java.util.Random;

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
    public void setSpeed(Posn speed) {
        this.speed = speed;
    }
    
    public void updatePosn() {
        this.position.x += this.speed.x;
        this.position.y += this.speed.y;
    }
    
    public void addY(int value) {
        this.position.y += value;
    }
    
    public boolean isLanded() {
        return this.position.y < 5;
    }
    
        
        
    public PairShot randomShot(PairShot shots) {      
        // call random bomb handler
        /*Random random = new Random();
        if (Random.nextBoolean()) {
            return new PairShot(
                new Shot(this.position, 20),
                shots
            );
        }*/
        return shots;
    }
}