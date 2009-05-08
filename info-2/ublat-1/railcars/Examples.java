

// Examples-Class
public class Examples {
    //IRail person_1 = new PersonRail(RAILKLASSEONE, 14, RAIL_STOCKE_ONE, RAIL_TYPE_GROS);
    //IRail person_2 = new PersonRail(RAILKLASSETWO, 21, RAIL_STOCKE_TWO, RAIL_TYPE_ABTEIL);
    //IRail person_3 = new PersonRail(RAILKLASSEONE, 0, RAIL_STOCKE_TWO, RAIL_TYPE_MISCH);
    IRail eat_1 = new EatRail(10);
    IRail eat_2 = new EatRail(21);
    IRail eat_3 = new EatRail(0);
    IRail sleep_1 = new SleepRail(20);
    IRail sleep_2 = new SleepRail(0);
    IRail sleep_3 = new SleepRail(21);
    IListRail empty_rail = new EmptyRail();
    IListRail zug_liste_single = new PairRail(eat_1, empty_rail);
    IListRail zug_liste_multi = new PairRail(sleep_1, zug_liste_single);
}
