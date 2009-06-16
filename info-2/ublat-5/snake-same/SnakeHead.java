import geometry.*;
import draw.*;
import colors.*;

// Kopf der Schlange
public class SnakeHead extends ASnake {
    Posn pos; // Position der linken oberen Ecke
    
    enum Direction { UP, DOWN, LEFT, RIGHT }
    Direction direction;
    
    SnakeHead(Posn pos, Direction direction) {
        super(20);
        this.pos = pos;
        this.direction = direction;
    }
    
    // Position der oberen linken Ecke berechnen
    public Posn position() {
        return this.pos;
    }
    
    public boolean same(SnakeHead head) {
        return this.pos.equals(head.pos) && this.direction == head.direction;
    }

    // Schlange zeichnen
    public boolean draw(Canvas c) {
        return c.drawDisk(new Posn(this.pos.x + this.SIZE / 2, this.pos.y + this.SIZE/2),
                          this.SIZE / 2, new Green());
    }

    // Schlange einen Schritt bewegen
    public ISnake move() {
        if (this.direction == SnakeHead.Direction.UP) {
            return new SnakeHead(new Posn(this.pos.x, this.pos.y - this.SIZE),
                                 this.direction);
        } else if (this.direction == SnakeHead.Direction.DOWN) {
            return new SnakeHead(new Posn(this.pos.x, this.pos.y + this.SIZE),
                                 this.direction);
        } else if (this.direction == SnakeHead.Direction.LEFT) {
            return new SnakeHead(new Posn(this.pos.x - this.SIZE, this.pos.y),
                                 this.direction);
        } else /* if (this.direction == SnakeHead.Direction.RIGHT) */ { 
            return new SnakeHead(new Posn(this.pos.x + this.SIZE, this.pos.y),
                                 this.direction);
        }
    }
    
        
    // relative Position zum nächsten Glied berechnen
    public SnakeLink.RelativePosition nextRelativePosition() {
        if (this.direction == SnakeHead.Direction.UP) {
            return SnakeLink.RelativePosition.DOWN;
        } else if (this.direction == SnakeHead.Direction.DOWN) {
            return SnakeLink.RelativePosition.UP;
        } else if (this.direction == SnakeHead.Direction.LEFT) {
            return SnakeLink.RelativePosition.RIGHT;
        } else /* if (this.direction == SnakeHead.Direction.RIGHT) */ {
            return SnakeLink.RelativePosition.LEFT;
        }
    }

    // Bewegungsrichtung der Schlange ändern
    public ISnake changeDirection(SnakeHead.Direction d) {
        return new SnakeHead(this.pos, d);
    }

    // feststellen, ob Schlange sich selbst frißt
    public boolean eatsItself() {
        return false;
    }

    // Kopf der Schlange ermitteln
    public SnakeHead head() {
        return this;
    }

}
