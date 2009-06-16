import org.junit.*;
import geometry.*;

public class SnakeWorldTest extends de.tuebingen.informatik.Test {

    SnakeHead h1 = new SnakeHead(new Posn(10, 10), SnakeHead.Direction.UP);
    ISnake s1 = new SnakeLink(h1, SnakeLink.RelativePosition.DOWN);
    ISnake s2 = new SnakeLink(h1, SnakeLink.RelativePosition.RIGHT);
    // ...
    
    ISnake s3 = new SnakeLink(new SnakeLink(new SnakeLink(new SnakeHead(new Posn(100, 100),
                                                                        SnakeHead.Direction.LEFT),
                                                          SnakeLink.RelativePosition.RIGHT),
                                            SnakeLink.RelativePosition.DOWN),
                              SnakeLink.RelativePosition.RIGHT);
                              
    ISnake s4 = new SnakeLink(new SnakeLink(new SnakeLink(new SnakeLink(h1,
                                                                        SnakeLink.RelativePosition.RIGHT),
                                                          SnakeLink.RelativePosition.DOWN),
                                            SnakeLink.RelativePosition.LEFT),
                              SnakeLink.RelativePosition.UP);
                                                          
    
    @Test
    public void position1() {
        checkExpect(h1.position(), new Posn(10, 10));
        checkExpect(s1.position(), new Posn(10, 30));
        checkExpect(s2.position(), new Posn(30, 10));
    }
    
    @Test
    public void move1() {
        checkExpect(s3.move(),
                    new SnakeLink(new SnakeLink(new SnakeLink(new SnakeHead(new Posn(80, 100),
                                                                        SnakeHead.Direction.LEFT),
                                                          SnakeLink.RelativePosition.RIGHT),
                                            SnakeLink.RelativePosition.RIGHT),
                              SnakeLink.RelativePosition.DOWN));
    }
    
    @Test
    public void extend1() {
        checkExpect(h1.extend(), 
                    // Schlange bei (10, 10), geht nach oben, ein Glied nac unten
                    new SnakeLink(h1, SnakeLink.RelativePosition.DOWN));
        checkExpect(s2.extend(),
                    // Schlange wie s1, mit zusätzlichem Glied nach rechts
                    new SnakeLink(s2, SnakeLink.RelativePosition.RIGHT));
    }
    
    @Test
    public void changeDirection1() {
        checkExpect(h1.changeDirection(SnakeHead.Direction.RIGHT),
                    // wie h1, schaut aber nach rechts
                    new SnakeHead(new Posn(10, 10), SnakeHead.Direction.RIGHT));
        checkExpect(s2.changeDirection(SnakeHead.Direction.LEFT),
                    // wie s2, schaut aber nach links
                    new SnakeLink(new SnakeHead(new Posn(10, 10), SnakeHead.Direction.LEFT),
                                  SnakeLink.RelativePosition.RIGHT));
    }

    @Test
    public void eatsItself1() {
        checkExpect(h1.eatsItself(), false);
        checkExpect(s1.eatsItself(), false);
        checkExpect(s2.eatsItself(), false);
        checkExpect(s4.eatsItself(), true);
    }
                    
}
