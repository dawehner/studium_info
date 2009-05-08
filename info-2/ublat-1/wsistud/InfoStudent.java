

// Eine Klasse für Informatik Studenten
public class InfoStudent implements IStudent{
  String name;
  int fachsemester;
  boolean basispraktikum;
  
  InfoStudent(String name, int fachsemester, boolean basispraktikum) {
    this.name = name;
    this.fachsemester = fachsemester;
    this.basispraktikum = basispraktikum;
  }
}
