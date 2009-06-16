import colors.*;
import draw.*;
import geometry.*;


// Gemeinsamkeiten aller Spielobjekte
public abstract class AGameObject implements IGameObject{

    IColor colorGameObject;
    Posn position;
    int velocity;
    
    public AGameObject(IColor colorGameObject, Posn position, int velocity){
        this.colorGameObject = colorGameObject;
        this.position = position;
        this.velocity = velocity;
    }
    
    public abstract boolean draw(Canvas c);
    
    public boolean hit(AGameObject igo) {
        double max_abstand = 10;
        return this.distance(this.position, igo.position) < max_abstand;
    }
    
    public double distance(Posn pos1, Posn pos2) {
        return Math.sqrt((pos1.x - pos2.x) * (pos1.x - pos2.x)
                         + (pos1.y - pos2.y) * (pos1.y - pos2.y));
    }
}
