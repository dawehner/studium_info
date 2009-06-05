import colors.*;
import draw.*;
import geometry.*;

// ein Schuss der alle anderen Objekte zerstören kann
public class Shot extends AGameObject{
      
    Shot(Posn position, int velocity){
         super(new Blue(), position, velocity);
    }
    
    public boolean draw(Canvas c){
        return c.drawRect(this.position, 2, 15, this.colorGameObject);
    }
}
