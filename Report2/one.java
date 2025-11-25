class Student {
  private String Name;
  private int id;
  private double cgpa;

  Student()
  {
    this("Unknown", 0, 0.0);
  }

  Student(String Name)
  {
    this(Name, 0, 0.0);
  }

  Student(String Name, int id, Double cgpa)
  {
    this.Name = Name;
    this.id = id;
    this.cgpa = cgpa;
  }

  void getter()
  {
    System.out.println("Name : " + this.Name);
    System.out.println("ID : " + this.id);
    System.out.println("Cgpa : " + this.cgpa);
    System.out.println("--------------------");

  }

}
public class one {
  public static void main(String[] args) {
    Student s = new Student();
    Student s1 = new Student("Masum");
    Student s2 = new Student("Masum", 621, 3.30);
    s.getter();

    s1.getter();
    s2.getter();
  }
}
