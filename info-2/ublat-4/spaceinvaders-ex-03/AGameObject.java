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
}
