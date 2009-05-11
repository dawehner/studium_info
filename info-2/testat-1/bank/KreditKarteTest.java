

public class KreditKarteTest extends de.tuebingen.informatik.Test {
  KreditKarte kkarte1 = new KreditKarte(10000, KreditKarte.KreditKartenTyp.PLATIN);
  KreditKarte kkarte2 = new KreditKarte(25000, KreditKarte.KreditKartenTyp.PLASTIK);
  KreditKarte kkarte3 = new KreditKarte(500000, KreditKarte.KreditKartenTyp.GOLD);
  
  @org.junit.Test
  public void updateCard() {
      checkExpect(kkarte1.updateCard(), new KreditKarte(0, KreditKarte.KreditKartenTyp.PLASTIK));
      checkExpect(kkarte2.updateCard(), new KreditKarte(0, KreditKarte.KreditKartenTyp.GOLD));
      checkExpect(kkarte3.updateCard(), new KreditKarte(0, KreditKarte.KreditKartenTyp.PLATIN));
  }
}
