

public class GiroKontoTest extends de.tuebingen.informatik.Test {
  GiroKonto gk1 = new GiroKonto(21);
  GiroKonto gk2 = new GiroKonto(50);
  GiroKonto gk3 = new GiroKonto(1000);
  GiroKonto gk4 = new GiroKonto(-25);
  
  @org.junit.Test
  public void calculateInterest() {
      checkExpect(gk1.calculateInterest(), 0.21);
      checkExpect(gk2.calculateInterest(), 0.5);
      checkExpect(gk3.calculateInterest(), 10.0);
      checkExpect(gk4.calculateInterest(), -2.5);
  }
  
  @org.junit.Test
  public void deposit() {
      checkExpect(gk1.deposit(2), new GiroKonto(19.0));
      checkExpect(gk4.deposit(5), new GiroKonto(-30.0));
  }

  @org.junit.Test
  public void accountWithInterest() {
      GiroKonto gk1_expected = new GiroKonto(21.21);
      GiroKonto gk2_expected = new GiroKonto(-27.5);
      checkExpect(gk1.accountWithInterest(), gk1_expected);
      checkExpect(gk4.accountWithInterest(), gk2_expected);
  }
}
