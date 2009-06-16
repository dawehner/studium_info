import colors.*;
import draw.*;
import geometry.*;

// Liste der Schüsse
public interface IShots {
    boolean draw(Canvas c);
    public void updatePosn();
}
