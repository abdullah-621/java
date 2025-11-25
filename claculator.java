class cal {
  int add(int a, int b)
  {
    return a + b;
  }

  void sqrt(int a)
  {
    System.out.println(a*a);
  }
}

public class claculator {
  
  public static void main(String[] args)
  {

    cal c1 = new cal();
    int sum = c1.add(10, 20);
    System.out.println(sum);
    c1.sqrt(5);

  }
}
