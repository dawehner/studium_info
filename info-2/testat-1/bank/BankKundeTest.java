

public class BankKundeTest extends de.tuebingen.informatik.Test {
  GiroKonto gk1 = new GiroKonto(21, 0.02, 0.04);
  GiroKonto gk1_ = new GiroKonto(9, 0.02, 0.04);
  GiroKonto gk2 = new GiroKonto(50, 0.05, 0.01);
  GiroKonto gk2_ = new GiroKonto(46, 0.05, 0.01);
  KreditKarte kkarte1 = new KreditKarte(100, PLATIN);
  KreditKarte kkarte2 = new KreditKarte(0, PLASTIK);
  BankKunde bk1 = new BankKunde("chx", gk2, kkarte1);
  BankKunde bk2 = new BankKunde("merlinofchaos", gk1, kkarte2);
  
  @org.junit.Test
  public void deposit() {
      checkExpect(bk1.deposit(12), gk1_);
      checkExpect(bk1.deposit(4), gk2_);
  }
}
