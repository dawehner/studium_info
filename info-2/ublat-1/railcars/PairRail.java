

// Klasse f�r ein Paar aus Z�gen/Zuglisten
public class PairRail implements IListRail {
  IRail first;
  IListRail rest;
  PairRail (IRail first, IListRail rest) {
      this.first = first;
      this.rest = rest;
  }
}
