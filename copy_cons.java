class man
{
  String name;
  int age;
  static int counter1;
  
  man(String name, int age)
  {
    this.name = name;
    this.age = age;
    counter1++;
  }

  static int counter2;
  man(man m)
  {
    this.name = m.name;
    this.age = m.age;
    counter2++;
  }

  void displayInfo()
  {
    System.out.println("Name : " + this.name);
    System.out.println("Age : " + this.age);
  }

  void showCounter()
  {
    System.out.println("Counter 1 : " + this.counter1);
    System.out.println("Counter 2 : " + this.counter2);
  }
}

public class copy_cons {
  public static void main(String[] args) {
    
    man m1 = new man("Masum", 22); 
    man m2 = new man(m1); 
    man m3 = new man(m2);
    
    m1.displayInfo();
    m1.showCounter();      

    m2.displayInfo();
    m2.showCounter();

    m3.displayInfo();
    m3.showCounter();
  }
}
