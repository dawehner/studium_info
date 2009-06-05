import colors.*;
import draw.*;
import geometry.*;

// Das Space-Invaders-Welt-Objekt.
public class SIWorld extends World{

    // feste Werte
    int HEIGHT = 500;
    int WIDTH = 500;
    IColor BACKGROUND = new White();
    
    // Parameter
    IAliens aliens;
    Canon canon;
    IShots shots;
    IBombs bombs;
    IShelters shelters;

    SIWorld(IAliens aliens, Canon canon, IShots shots, IBombs bombs, IShelters shelters){
        this.aliens = aliens;
        this.canon = canon;
        this.shots = shots;
        this.bombs = bombs;
        this.shelters = shelters;
    }    
    
    public boolean draw(){
        return
            this.theCanvas.drawRect(new Posn(0,0), this.WIDTH, this.HEIGHT, this.BACKGROUND)
            && this.aliens.draw(this.theCanvas)
            && this.canon.draw(this.theCanvas)
            && this.shots.draw(this.theCanvas)
            && this.bombs.draw(this.theCanvas)
            && this.shelters.draw(this.theCanvas);
    }
    
    // Dummy-Implementierungen für die abstrakten Methoden der Oberklasse
    public World onTick(){
        this.aliens.updatePosn();
        return this;
    }
    
    public World onKeyEvent(String k){        
        return this;
    }
}
