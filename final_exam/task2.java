

class Employee
{
  String name;
  int id;
  static int totalEmployees = 0;

  Employee(String name, int id)
  {
    this.name = name;
    this.id = id;
    totalEmployees++;
  }

  void showDetails()
  {
    System.out.println("ID : [" + id + "] | Name : [" + name + " ]");
  }

  static int getTotalEmployees()
  {
    return totalEmployees;
  }
}

public class task2 {
  public static void main(String[] args) {
    Employee e1 = new Employee("Abdullah", 600);
    Employee e2 = new Employee("Masum", 670);
    Employee e3 = new Employee("Shafi", 603);

    e1.showDetails();
    System.out.println("Total employes : " + e1.getTotalEmployees());

    e2.showDetails();
    System.out.println("Total employes : " +e2.getTotalEmployees());
    e3.showDetails();
    System.out.println("Total employes : " +e3.getTotalEmployees());
  }
}
