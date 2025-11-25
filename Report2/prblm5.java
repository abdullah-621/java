class Student
{
  String name;
  String Depertment;
  int batch;
  int id;

  Student()
  {
    name = "Unkhown";
    Depertment = "Unknown";
    batch = 0;
    id = 0;
  }

  Student(String name, String Depertment, int batch, int id)
  {
    this.name = name;
    this.Depertment = Depertment;
    this.batch = batch;
    this.id = id;
  }

  void displayInfo()
  {
    System.out.println();
    System.out.println("Name : " + this.name);
    System.out.println("Depertment : " + this.Depertment);
    System.out.println("Batch : " + this.batch);
    System.out.println("ID : " + this.id);
    System.out.println();
  }
}

public class prblm5 {
  public static void main(String[] args) {
    Student[] students = new Student[3];

    students[0] = new Student("Abdullah", "CSE", 65, 621);
    students[1] = new Student("AL", "EEE", 45, 500);
    students[2] = new Student("Masum", "MCE", 38, 700);

    for (int i = 0; i < students.length; i++) 
    {
      students[i].displayInfo();
      System.out.println("-----------------");
    }
  }
}
