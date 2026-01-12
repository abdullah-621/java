class parent {
  int age;
  int id;
  int salary;

  // parent()
  // {
  //   this(89, 90, 80000);
  //   System.out.println("Excitude parent constractor using this chaining");
  // }

  parent(int age, int id, int salary) {
    this.age = age;
    this.id = id;
    this.salary = salary;
    System.out.println("Parent constractor");
  }

  void display() {
    System.out.println(age + id + salary);
  }

  void display2()
  {
    this.display();
  }
}

class child extends parent
{
  child(int age, int id, int salary)
  {
    super(age, id, salary);
    System.out.println("Child constractor");
  }

  void show()
  {
    display();
    System.out.println(super.age);
    super.display();
    super.display2();
  }
}

public class main3 {
  public static void main(String[] args) {
    parent p = new parent(56,67,53);
    p.display2();
    child c = new child(0, 0, 0);
    c.show();
  }
}
