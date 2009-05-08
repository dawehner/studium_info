

// Eine Klasse für BioInformatiker
public class BioInfoStudent implements IStudent{
  String name;
  int fachsemester;
  boolean tierpsycho;
  
  BioInfoStudent(String name, int fachsemester, boolean tierpsycho) {
    this.name = name;
    this.fachsemester = fachsemester;
    this.tierpsycho = tierpsycho;
  }
}
