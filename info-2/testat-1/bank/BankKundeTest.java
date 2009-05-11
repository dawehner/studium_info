

public class BankKundeTest extends de.tuebingen.informatik.Test {
  GiroKonto gk1 = new GiroKonto(21);
  GiroKonto gk1_ = new GiroKonto(9);
  GiroKonto gk2 = new GiroKonto(50);
  GiroKonto gk2_ = new GiroKonto(46);
  KreditKarte kkarte1 = new KreditKarte(100, KreditKarte.KreditKartenTyp.PLATIN);
  KreditKarte kkarte2 = new KreditKarte(0, KreditKarte.KreditKartenTyp.PLASTIK);
  BankKunde bk1 = new BankKunde("chx", gk1, kkarte1);
  BankKunde bk2 = new BankKunde("merlinofchaos", gk2, kkarte2);
  
  @org.junit.Test
  public void deposit() {
      checkExpect(bk1.deposit(12), new BankKunde("chx", gk1_, kkarte1));
      checkExpect(bk2.deposit(4), new BankKunde("merlinofchaos", gk2_, kkarte2));
  }
  
  @org.junit.Test
  public void annualUpdate() {
    checkExpect(bk1.annualUpdate(), new BankKunde("chx", gk1.accountWithInterest(), kkarte1.updateCard()));
    checkExpect(bk2.annualUpdate(), new BankKunde("merlinofchaos", gk2.accountWithInterest(), kkarte2.updateCard()));
  }
}
