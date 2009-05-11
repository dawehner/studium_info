

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
  
  // Bucht etwas vom Konto des Bannkunden ab
  public BankKunde deposit(double value) {
      return new BankKunde(
        this.name,
        this.girokonto.deposit(value),
        this.kreditkarte
      );
  }
  
  // macht das jährliche update
  public BankKunde annualUpdate() {
    return new BankKunde(
      this.name,
      this.girokonto.accountWithInterest(),
      this.kreditkarte.updateCard()
    );
  }
}
