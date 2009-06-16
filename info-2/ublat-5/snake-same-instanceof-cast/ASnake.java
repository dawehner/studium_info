import geometry.*;

// Gemeinsamkeiten der Implementierungen von ISnake
public abstract class ASnake implements ISnake {
    int SIZE;

    ASnake(int SIZE) {
        this.SIZE = SIZE;
    }
    
    // Größe dieses Schlangenglieds berechnen
    public int size() {
        return this.SIZE;
    }

    // Schlange um 1 Glied erweitern
    public ISnake extend() {
        return new SnakeLink(this, // vorherige Schlange
                             this.nextRelativePosition()); // Gegenrichtung zur Bewegungsrichtung
    }

    // Mittelpunkt des Schlangenglieds berechnen
    public Posn center() {
        return new Posn(this.position().x + (this.size() / 2),
                        this.position().y + (this.size() / 2));
    }

}
