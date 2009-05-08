

// Klasse für Girokonten.
public class GiroKonto {
  double kontostand;
  double guthabenzins;
  double uberzugszins;
  
  GiroKonto(double kontostand, double guthabenzins, double uberzugszins) {
      this.kontostand = kontostand;
      this.guthabenzins = guthabenzins;
      this.uberzugszins = uberzugszins;
  }
  
  public double calculateInterest() {
    return kontostand * (this.kontostand >= 0 ? this.guthabenzins : this.uberzugszins);
  }
  
  public double deposit(double val) {
      this.kontostand -= val;
      return this.kontostand;
  }
  
  public double withdraw(double val) {
      this.kontostand += val;
      return this.kontostand;
  }
  
  public void accountWithInterest() {
      this.kontostand += this.calculateInterest();
  }
}
