import draw.*;
import geometry.*;
import colors.*;

// Spielfeld für Snake
public class SnakeWorld extends World {
    int WIDTH;
    int HEIGHT;
    
    ISnake snake;
    int time;
    
    SnakeWorld(ISnake snake, int time) {
        this.snake = snake;
        this.WIDTH = 500;
        this.HEIGHT = 200;
        this.time = time;
    }
    
    // Spielfeld mit Schlange zeichnen
    public boolean draw() {
        return this.theCanvas.drawRect(new Posn(0, 0), this.WIDTH, this.HEIGHT, new Blue())
          && this.snake.draw(this.theCanvas);
    }
    
    // auf Tastendruck reagiieren
    public World onKeyEvent(String s) {
        if (s.equals("up")) {
            return new SnakeWorld(this.snake.changeDirection(SnakeHead.Direction.UP), this.time);
        } else if (s.equals("down")) {
            return new SnakeWorld(this.snake.changeDirection(SnakeHead.Direction.DOWN), this.time);
        } else if (s.equals("right")) {
            return new SnakeWorld(this.snake.changeDirection(SnakeHead.Direction.RIGHT), this.time);
        } else if (s.equals("left")) {
            return new SnakeWorld(this.snake.changeDirection(SnakeHead.Direction.LEFT), this.time);
        } else {
           return this;
        }
    }
    
    public World onTick() {
        if (this.snake.eatsItself()) {
            return this.endOfWorld("Game over");    
        } else if (this.time % 10 == 0) {
            return new SnakeWorld(this.snake.extend(), this.time + 1);
        } else {
            return new SnakeWorld(this.snake.move(), this.time + 1);
        }
    }
    
    // Animation starten
    public boolean start() {
        return this.bigBang(this.WIDTH, this.HEIGHT, 0.2);
    }
}
