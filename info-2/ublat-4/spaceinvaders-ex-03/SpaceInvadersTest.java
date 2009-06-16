import colors.*;
import draw.*;
import geometry.*;


public class SpaceInvadersTest extends de.tuebingen.informatik.Test {
    
    // der Beispiel-Screenshot vom Übungsblatt mit Kanone, Aliens,
    // Schutzwällen, Schüssen und Bomben
    
    Posn alienspeed = new Posn(20, 0); // nur in x richtung

    Canon a = new Canon(160, 500+10 - (500 / 6), 10);
    Alien u = new Alien(new Posn(150,50), 2, alienspeed);
    Alien u2 = new Alien(new Posn(50,50), 2, alienspeed);
    Alien u3 = new Alien(new Posn(250,50), 2, alienspeed);
    Alien u4 = new Alien(new Posn(350,50), 2, alienspeed);
    Alien u5 = new Alien(new Posn(150,100), 2, alienspeed);
    Alien u6 = new Alien(new Posn(50,100), 2, alienspeed);
    Alien u7 = new Alien(new Posn(250,100), 2, alienspeed);
    Alien u8 = new Alien(new Posn(350,100), 2, alienspeed);
    
    Alien uu = new Alien(new Posn(150,150), 2, alienspeed);
    Alien uu2 = new Alien(new Posn(50,150), 2, alienspeed);
    Alien uu3 = new Alien(new Posn(250,150), 2, alienspeed);
    Alien uu4 = new Alien(new Posn(350,150), 2, alienspeed);
    Alien uu5 = new Alien(new Posn(150,200), 2, alienspeed);
    Alien uu6 = new Alien(new Posn(50,200), 2, alienspeed);
    Alien uu7 = new Alien(new Posn(250,200), 2, alienspeed);
    Alien uu8 = new Alien(new Posn(350,200), 2, alienspeed);
    
    IAliens alien = new PairAlien(u, new PairAlien(u2, new PairAlien(u3, 
                new PairAlien(u4, new PairAlien(u5, new PairAlien(u6, 
                new PairAlien(u7, new PairAlien(u8, 
                new PairAlien(uu, new PairAlien(uu2, new PairAlien(uu3, 
                new PairAlien(uu4, new PairAlien(uu5, new PairAlien(uu6, 
                new PairAlien(uu7, new PairAlien(uu8, new EmptyAlien()))))))))))))))));
    
    Shot s = new Shot(new Posn(175, 400), -20);
    Shot s2 = new Shot(new Posn(150, 300), -20);
    Shot s3 = new Shot(new Posn(140, 280), -20);
    
    IShots shots = new PairShot(s, new PairShot(s2, new PairShot(s3, new EmptyShot())));
    
    
    Bomb b = new Bomb(new Posn(170, 300), 20);
    Bomb b2 = new Bomb(new Posn(110, 250), 20);
    Bomb b3 = new Bomb(new Posn(180, 350), 20);
    
    IBombs bombs = new PairBomb(b, new PairBomb(b2, new PairBomb(b3, new EmptyBomb())));
    
    Shelter sh = new Shelter(100, 500 - (500 / 4), 100);
    Shelter sh2 = new Shelter(225, 500 - (500 / 4), 100);
    Shelter sh3 = new Shelter(350, 500 - (500 / 4), 100);
    
    IShelters shelters = new PairShelter(sh, new PairShelter(sh2, new PairShelter(sh3, new EmptyShelter())));
    
    SIWorld w = new SIWorld(alien, a, shots, bombs, shelters);
    
    @org.junit.Test
    public void testEvalConst() {
        checkExpect(w.bigBang(500,500,0.06), true);
    }
    
    @org.junit.Test
    public void removeBomb() {
        checkExpect(bombs.removeBomb(b), new PairBomb(b2, new PairBomb(b3, new EmptyBomb())));
    }
    
}
