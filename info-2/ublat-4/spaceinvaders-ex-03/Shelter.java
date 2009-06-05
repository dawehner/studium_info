import colors.*;
import draw.*;
import geometry.*;

// Ein Schutzwall, der ein paar Schüsse abwehren kann, solange sein Leben nicht 0 ist.
public class Shelter extends AGameObject{

    int health;
    
    Shelter(int position, int height, int health){
        super(new Green(), new Posn(position, height), 0);
        this.health = health;
    }    
    
    public boolean draw(Canvas c){
        return c.drawRect(this.position, 
                            50, 20, this.colorGameObject)
                            &&
               c.drawRect(new Posn(this.position.x, this.position.y+20), 
                            10, 10, this.colorGameObject)
                            &&
               c.drawRect(new Posn(this.position.x+40, this.position.y+20), 
                            10, 10, this.colorGameObject);
    }   
}
