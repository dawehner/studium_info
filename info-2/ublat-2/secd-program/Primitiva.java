

// Kurzbeschreibung
public class Primitiva implements IPrim {
  enum Operator{PLUS, MINUS, MAL, TEILT, NOT, GREATER, SMALLER, GREATER_EQUAL, SMALLER_EQUAL, EQUAL, AND, OR};
  Operator operator;
  int s; // Stelligkeit
  
  Primitiva(Operator operator, int s) {
      this.operator = operator;
      this.s = s;
    }
}
