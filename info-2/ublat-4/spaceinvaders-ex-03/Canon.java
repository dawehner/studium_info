import colors.*;
import draw.*;
import geometry.*;

// Die mobile Waffenplattform zur Verteidigung der Erde. Die Position gibt die X-Koordiante an.
public class Canon extends AGameObject{

    Canon(int position, int height, int velocity){
         super(new Black(), new Posn(position, height), velocity);
    }
    
    public boolean draw(Canvas c){
        return c.drawRect(this.position, 
                            20, 10, this.colorGameObject)
                            &&
               c.drawRect(new Posn(this.position.x+9, this.position.y-5), 
                            2, 5, this.colorGameObject);
    }
}
