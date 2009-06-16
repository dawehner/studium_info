import draw.*;
import colors.*;
import geometry.*;

// Nicht-Kopf-Glied einer Schlange
public class SnakeLink extends ASnake {
    ISnake previous;
    
    enum RelativePosition { UP, DOWN, LEFT, RIGHT }
    RelativePosition relPos;
    
    SnakeLink(ISnake previous, RelativePosition relPos) {
        super(10);
        this.previous = previous;
        this.relPos = relPos;
    }
    
    public boolean same(SnakeLink link) {
        return this.previous.same(link.previous) && this.relPos == link.relPos;
    }
    
    // Position der linken oberen Ecke des Glieds this berechnen
    public Posn position() {
        if (this.relPos == SnakeLink.RelativePosition.UP) {
            return new Posn(this.previous.position().x,
                            this.previous.position().y - this.previous.size());
        } else if (this.relPos == SnakeLink.RelativePosition.DOWN) {
            return new Posn(this.previous.position().x,
                            this.previous.position().y + this.previous.size());
        } else if (this.relPos == SnakeLink.RelativePosition.LEFT) {
            return new Posn(this.previous.position().x - this.previous.size(),
                            this.previous.position().y);
        } else { // SnakeLink.RelativePosition.RIGHT
            return new Posn(this.previous.position().x + this.previous.size(),
                            this.previous.position().y);
        }
    }

    // Schlange zeichnen
    public boolean draw(Canvas c) {
        return c.drawCircle(new Posn(this.position().x + this.SIZE / 2,
                                     this.position().y + this.SIZE/2),
                          this.SIZE / 2, new Green())
                          && this.previous.draw(c);

    }
    
    // Schlange einen Schritt bewegen
    public ISnake move() {
        return new SnakeLink(this.previous.move(), // Vorderteil der Schlange, bewegt
                             this.previous.nextRelativePosition());
    }
    
    // relative Position zum nächsten Glied berechnen
    public SnakeLink.RelativePosition nextRelativePosition() {
        return this.relPos;
    }
    
    // Bewegungsrichtung der Schlange ändern
    public ISnake changeDirection(SnakeHead.Direction d) {
        return new SnakeLink(this.previous.changeDirection(d),
                                 // Vorderteil der Teile, Bewegungsrichtung geändert
                            this.relPos);
    }
    
    // Abstand zweier Punkte berechnen
    public double distance(Posn pos1, Posn pos2) {
        return Math.sqrt((pos1.x - pos2.x) * (pos1.x - pos2.x)
                         + (pos1.y - pos2.y) * (pos1.y - pos2.y));
    }

    // feststellen, ob Schlange sich selbst frißt
    public boolean eatsItself() {
        SnakeHead head = this.head();
        return distance(this.center(),
                        head.center()) 
                < ((this.size() / 2) + (head.size() / 2))
        
          || this.previous.eatsItself();  // frißt der vorige Teil der Schlange sich selbst?
    }

    // Kopf der Schlange ermitteln
    public SnakeHead head() {
        return this.previous.head();
    }


}
