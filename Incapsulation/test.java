class student {
  private String name;
  private int id;
  private float cgpa;

  student() {
    this("Unknown", 0, 0.0f);
  }

  student(String name) {
    this(name, 0, 0.0f);
  }

  student(String name, int id, float cgpa) {
    this.name = name;
    this.id = id;
    this.cgpa = cgpa;
  }

  void getter() {
    System.out.println("Name : " + this.name);
    System.out.println("Id : " + this.id);
    System.out.println("Cgpa : " + this.cgpa);

    System.out.println("------------------------");
  }
}

class masum extends student
{
  masum()
  {
    super();
  }
  masum(String name)
  {
    super(name);
  }

  masum(String name, int id, float cgpa)
  {
    super(name, id, cgpa);
  }

}

public class test {
    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student("Masum");
        student s3 = new student("Masum", 621, 3.30f);

        s1.getter();
        s2.getter();
        s3.getter();

        System.out.println("\n\nFor Masum Class\n");

        masum m1 = new masum();
        masum m2 = new masum("Abdulah Al Masum");
        masum m3 = new masum("Abdullah al Masum", 621, 3.30f);

        m1.getter();
        m2.getter();
        m3.getter();
    }
}
