// class show {
//   static void s()
//   {
//     System.out.println("Static Method");
//   }

//   void m()
//   {
//     System.out.println("Normal Method");
//   }
// }

// public class staticMethod {
//   public static void main(String[] args)
//   {
//     show.s();
//     show s1 = new show();
//     s1.m();
//   }
// }

class Calculator {
  static String n = "Masum";

  Calculator()
  {
    System.out.println(n);
  }
  
  static int sum(int a, int b)
  {
    return a + b;
  }

  static void show()
  {
    System.out.println("Static Mthod");
  }
}

public class staticMethod {
  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    
    int sum = Calculator.sum(10, 20);
    System.out.println(sum);
    Calculator.show();
  }
}
