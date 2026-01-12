class Students {
  String name;

  Students(String name, int id) {
    this.name = name;
    System.err.println("Students constractor called -> " + name + " " + id);
  }
}

class person extends Students {
  
  int id;

  person(String name, int id)
  {
    super(name,id);
    this.id = id;
    System.out.println("Person constractor called -> " + name + " " + id);
  }

}

public class main1 {
  public static void main(String[] args) {
    person s = new person("Masum", 10);

  }
}
// class parent {

//   parent()
//   {
//     System.err.println("This is parenet class constractor");
//   }
//   int x = 10;

//   void greet()
//   {
//     System.err.println("This is parent class");
//   }
// }

// class child extends parent {
//   child()
//   {
//     super();
//     System.err.println("This is child class constractor");
//   }
//   int a = 20;

//   void display()
//   {
//     super.greet();
//     System.out.println(super.x);
//   }

// }

// public class main1 {

//   public static void main(String[] args) {
//     child c = new child();
//     c.display();
//   }
// }