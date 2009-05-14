import colors.*;
import geometry.*;

// Kurzbeschreibung
public class World {
    Alien alien;
    Bomb bomb;
    Tank tank;
    Shot shot;
    Bunker bunker;
    IColor color;
    Posn measure;
    
    World(Alien alien, Bomb bomb, Tank tank, Shot shot, Bunker bunker, IColor color, Posn measure) {
        this.alien = alien;
        this.bomb = bomb;
        this.tank = tank;
        this.shot = shot;
        this.bunker = bunker;
        this.color = color;
        this.measure = measure;
    }
}
