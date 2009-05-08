

// Eine Klase f+r PersonenWägen
public class PersonRail implements IRail{
  private enum Klasse {
      RAILKLASSEONE,
      RAILKLASSETWO
    };
  private Klasse klasse;
  
  private int seats;
  private enum Stocke {
      RAIL_STOCKE_ONE,
      RAIL_STOCKE_TWO
    };
  private Stocke stocke;
  private enum Type {
      RAIL_TYPE_GROS,
      RAIL_TYPE_ABTEIL,
      RAIL_TYPE_MISCH
    };
  private Type type;
  PersonRail(Klasse klasse, int seats, Stocke stocke, Type type) {
      this.klasse = klasse;
      this.seats = seats;
      this.stocke = stocke;
      this.type = type;
    }
}

