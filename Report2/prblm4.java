class Employee
{
  String name;
  String gender;
  String department;
  int salary;
  int employeeID;

  Employee()
  {
    name = "Unknown";
    gender = "Unknown";
    salary = 0;
    employeeID = 0;
    department = "Unknown";
  }

  Employee(String name, int salary, int employeeID)
  {
    this.name = name;
    this.salary = salary;
    this.employeeID = employeeID;
  }

  Employee(String name, String gender, String department)
  {
    this.name = name;
    this.gender = gender;
    this.department = department;
  }

  void showInfo()
  {
    System.out.println();
    System.out.println("Name : " + this.name);
    System.out.println("Gender : " + this.gender);
    System.out.println("Depertment : " + this.department);
    System.out.println("Employee ID : " + this.employeeID);
    System.out.println("Salary : " + this.salary);
    System.out.println();
  }

  
}

public class prblm4 {
  public static void main(String[] args) 
  {
    Employee e1 = new Employee();
    Employee e2 = new Employee("Abdullah", 800000, 621);
    Employee e3 = new Employee("Masum", "Male", "CSE");

    e1.showInfo();
    System.out.println("--------------------");
    e2.showInfo();
    System.out.println("--------------------");
    e3.showInfo();
  }
}
