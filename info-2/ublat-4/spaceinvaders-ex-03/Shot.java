import colors.*;
import draw.*;
import geometry.*;

// ein Schuss der alle anderen Objekte zerstören kann
public class Shot extends AGameObject{

    Posn speed;
      
    Shot(Posn position, int velocity){
         super(new Blue(), position, velocity);
         this.speed = new Posn(0, -5);
    }
    
    public boolean draw(Canvas c){
        return c.drawRect(this.position, 2, 15, this.colorGameObject);
    }
    
    public void updatePosn() {
        this.position.x += this.speed.x;
        this.position.y += this.speed.y;
    }
}
