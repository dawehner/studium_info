import draw.*;
import geometry.*;

// Schlange
public interface ISnake {
    // Schlange zeichnen
    public boolean draw(Canvas c);
    
    // Position der oberen linken Ecke berechnen
    public Posn position();
    
    // Größe dieses Schlangenglieds berechnen
    public int size();
    
    // Schlange einen Schritt bewegen
    public ISnake move();
    
    // relative Position zum nächsten Glied berechnen
    public SnakeLink.RelativePosition nextRelativePosition();

    // Schlange um 1 Glied erweitern
    public ISnake extend();
    
    // Bewegungsrichtung der Schlange ändern
    public ISnake changeDirection(SnakeHead.Direction d);
    
    // feststellen, ob Schlange sich selbst frißt
    public boolean eatsItself();

    // Mittelpunkt des Schlangenglieds berechnen
    public Posn center();
    
    // Kopf der Schlange ermitteln
    public SnakeHead head();
}
