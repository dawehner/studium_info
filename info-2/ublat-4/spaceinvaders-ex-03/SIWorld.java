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
        this.bombs.updatePosn();        
        this.shots.updatePosn();
        //this.bombs.hitsWalls(this.shelters);
        return this;
    }

    public World onKeyEvent(String s) {
        if (s.equals("up")) {
            IShots shots = new PairShot(
                new Shot(this.canon.position, -5),
                this.shots
            );
            return new SIWorld(
                this.aliens,
                this.canon,
                shots,
                this.bombs,
                this.shelters
            );
        } else if (s.equals("down")) {
        } else if (s.equals("right")) {
            this.canon.position.x += 5;
            return new SIWorld(
                this.aliens,
                new Canon(this.canon.position.x + 5, this.canon.position.y, this.canon.velocity),
                this.shots,
                this.bombs,
                this.shelters
            );
        } else if (s.equals("left")) {
            return new SIWorld(
                this.aliens,
                new Canon(this.canon.position.x - 5, this.canon.position.y, this.canon.velocity),
                this.shots,
                this.bombs,
                this.shelters
            );
        } else {
            return new SIWorld(
                this.aliens,
                this.canon,
                this.shots,
                this.bombs,
                this.shelters
            );
        }
            return new SIWorld(
                this.aliens,
                this.canon,
                this.shots,
                this.bombs,
                this.shelters
            );
    }
}
