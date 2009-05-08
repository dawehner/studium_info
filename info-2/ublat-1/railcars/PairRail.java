

// Klasse für ein Paar aus Zügen/Zuglisten
public class PairRail implements IListRail {
  IRail first;
  IListRail rest;
  PairRail (IRail first, IListRail rest) {
      this.first = first;
      this.rest = rest;
  }
}
