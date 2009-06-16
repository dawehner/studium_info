import colors.*;
import draw.*;
import geometry.*;

// Liste der Schutzwälle
public interface IShelters {
    boolean draw(Canvas c);
    public Shelter first();
    public IShelters rest();
}
