class man {
  String name;
  int age;

  man()
  {
    this("Unkhown", 0);
  }
  man(String n, int a)
  {
    name = n;
    age = a;
  }

  void displayInfo()
  {
    System.out.print("Name : " + name + "\nand Age : " + age);
  }
  
}

public class this_chaining 
{
  public static void main(String[] args) {
    {
      man m = new man("Masum", 0);
      m.displayInfo();
    }
  }
}
