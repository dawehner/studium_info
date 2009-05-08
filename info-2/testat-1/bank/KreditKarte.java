

// Klasse für Kreditkarten.
public class KreditKarte {
  double umsatz;
  enum KreditKartenTyp {PLASTIK, GOLD, PLATIN};
  KreditKartenTyp kreditkartentyp;
  
  KreditKarte(double umsatz, KreditKartenTyp kreditkartentyp) {
      this.umsatz = umsatz;
      this.kreditkartentyp = kreditkartentyp;
  }
  
  public void updateCard() {
      
      // update kreditkartentyp based on umsatz;
      if (this.umsatz <= 20000) {
          this.kreditkartentyp = kreditkartentyp.PLASTIK;
      }
      else if(this.umsatz <= 200000) {
          this.kreditkartentyp = kreditkartentyp.GOLD;
      }
      else {
         this.kreditkartentyp = kreditkartentyp.PLATIN;
      }
      
      this.umsatz = 0.0;
  }
}
