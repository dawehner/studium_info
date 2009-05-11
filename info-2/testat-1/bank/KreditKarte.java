

// Klasse für Kreditkarten.
public class KreditKarte {
  double umsatz;
  enum KreditKartenTyp {PLASTIK, GOLD, PLATIN};
  KreditKartenTyp kreditkartentyp;
  
  KreditKarte(double umsatz, KreditKartenTyp kreditkartentyp) {
      this.umsatz = umsatz;
      this.kreditkartentyp = kreditkartentyp;
  }
  
  public KreditKarte updateCard() {
      
      // update kreditkartentyp based on umsatz;
      if (this.umsatz <= 20000) {
         return new KreditKarte(
           0.0,
           KreditKartenTyp.PLASTIK
         );
      }
      else if(this.umsatz <= 200000) {
         return new KreditKarte(
           0.0,
           KreditKartenTyp.GOLD
         );
      }
      else {
         return new KreditKarte(
           0.0,
           KreditKartenTyp.PLATIN
         );
      }
  }
}
