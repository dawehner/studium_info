import org.junit.*;

public class TripleTest extends de.tuebingen.informatik.Test {
    Triple tr1 = new Triple(1, 2, 3);
    Triple tr2 = new Triple(2, 1, 3);
    Triple tr3 = new Triple(2, 3, 1);
    Triple tr4 = new Triple(3, 2, 1);
    Triple tr5 = new Triple(3, 5, 7);
    Triple tr6 = new Triple(2, 6, 4);
    Triple tr7 = new Triple(3, 1, 1);
    Triple tr8 = new Triple(4, 2, 1);
    Triple tr9 = new Triple(19052009, 10, 20);
    
    @Test
    public void firstBetween() {
        checkExpect(tr1.firstBetween(), false);
        checkExpect(tr2.firstBetween(), true);
        checkExpect(tr3.firstBetween(), true);
    }
    
    @Test
    public void firstMinMax() {
        checkExpect(tr1.firstMinMax(), true);
        checkExpect(tr2.firstMinMax(), false);        
        checkExpect(tr3.firstMinMax(), false);
    }
    
    @Test
    public void teilbarFirst() {
        checkExpect(tr5.teilbarFirst(), false);
        checkExpect(tr6.teilbarFirst(), true);
    }
    
    @Test
    public void nr4() {
        checkExpect(tr6.nr4(), true);
        checkExpect(tr7.nr4(), false);
        checkExpect(tr8.nr4(), true);
    }
    
    @Test
    public void isPrim() {
        checkExpect(tr7.isPrim(), true);
        checkExpect(tr9.isPrim(), true);
        checkExpect(tr8.isPrim(), false);
    }
}
