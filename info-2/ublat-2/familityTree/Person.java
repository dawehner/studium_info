

// Kurzbeschreibung
public class Person {
    String name;
    int year;
    IEntry mother;
    IEntry father;
    
    Person(String name, int year, IEntry mother, IEntry father) {
        this.name = name;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }
    
    boolean hasKnownParents() {
        return this.mother.isKnownPerson() && this.father.isKnownPerson();
    }
    
    boolean isKnownPerson() {
        return true;
    }
    
    IEntry getMother() {
        return this.mother;
    }
    
    IEntry getFather() {
        return this.father;
    }
    /*
    boolean isRelatedTo(IEntry Person) {
    }
    */
   
   int numberOfKnownAncestors() {
       int KnownAncestors = 0;
       
       // @TODO Brauchen wir hier einen Test(if)
       if (this.mother.isKnownPerson()) {
           KnownAncestors += this.mother.numberOfKnownAncestors() + 1;
        }
        if (this.father.isKnownPerson()) {
            KnownAncestors += this.father.numberOfKnownAncestors() + 1;
        }
        
        return KnownAncestors;
    }
}
