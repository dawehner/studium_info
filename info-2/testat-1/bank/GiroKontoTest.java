

public class GiroKontoTest extends de.tuebingen.informatik.Test {
  GiroKonto gk1 = new GiroKonto(21, 0.02, 0.04);
  GiroKonto gk2 = new GiroKonto(50, 0.05, 0.01);
  GiroKonto gk3 = new GiroKonto(1000, 0.1, 0.00);
  GiroKonto gk4 = new GiroKonto(-25, 0.1, 0.03);
  
  @org.junit.Test
  public void calculateInterest() {
      checkExpect(gk1.calculateInterest(), 0.42);
      checkExpect(gk2.calculateInterest(), 2.5);
      checkExpect(gk3.calculateInterest(), 100.0);
      checkExpect(gk4.calculateInterest(), -0.75);
  }
  
  @org.junit.Test
  public void deposit() {
      checkExpect(gk1.deposit(2), 19.0);
      checkExpect(gk4.deposit(5), -30.0);
  }
  
  @org.junit.Test
  public void withdraw() {
      checkExpect(gk2.withdraw(3), 53.0);
      checkExpect(gk3.withdraw(10), 1010.0);
  }
  @org.junit.Test
  public void accountWithInterest() {
      gk1.accountWithInterest();
      gk4.accountWithInterest();
      GiroKonto gk1_expected = new GiroKonto(21.42, 0.02, 0.04);
      GiroKonto gk2_expected = new GiroKonto(-25.75, 0.1, 0.03);
      checkExpect(gk1, gk1_expected);
      checkExpect(gk4, gk2_expected);
  }
}
