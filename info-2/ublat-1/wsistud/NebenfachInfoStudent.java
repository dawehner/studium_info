

// Kurzbeschreibung
public class NebenfachInfoStudent implements IStudent{
  String name;
  int fachsemester;
  String hauptfach;
  
  NebenfachInfoStudent(String name, int fachsemester, String hauptfach) {
    this.name = name;
    this.fachsemester = fachsemester;
    this.hauptfach = hauptfach;
  }
}

