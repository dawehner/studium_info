

// Klasse für Girokonten.
public class GiroKonto {
  double kontostand;
  double guthabenzins;
  double uberzugszins;
  
  //GiroKonto(double kontostand, double guthabenzins = 0.01, double uberzugszins = 0.1) {
  GiroKonto(double kontostand) {
      this.kontostand = kontostand;
      //this.guthabenzins = guthabenzins;
      this.guthabenzins = 0.01;
      //this.uberzugszins = uberzugszins;
      this.uberzugszins = 0.1;
  }
  
  public double calculateInterest() {
    // Trinärer Operator
    return kontostand * (this.kontostand >= 0 ? this.guthabenzins : this.uberzugszins);
  }
  
  public GiroKonto deposit(double val) {
      return new GiroKonto(this.kontostand - val);
  }
  
  public GiroKonto accountWithInterest() {
      return new GiroKonto(this.kontostand + this.calculateInterest());
  }
}
