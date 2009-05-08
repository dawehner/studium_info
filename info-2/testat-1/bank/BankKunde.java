

// Klasse für Bankkunden
public class BankKunde {
  String name;
  GiroKonto girokonto;
  KreditKarte kreditkarte;
  
  BankKunde(String name, GiroKonto girokonto, KreditKarte kreditkarte) {
      this.name = name;
      this.girokonto = girokonto;
      this.kreditkarte = kreditkarte;
  }
  
  public GiroKonto deposit(double val) {
      this.girokonto.deposit(val);
      return this.girokonto;
  }
  
  public void annualUpdate() {
      girokonto.accountWithInterest();
      kreditkarte.updateCard();
  }
}
