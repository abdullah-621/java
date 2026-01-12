class person
{
  void add(int a, int b)
  {
    System.err.println(a + b);
  }

  void add(int a,int b, int c)
  {
    System.err.println(a + b + c);
  }


}

public class overlode {
  public static void main(String[] args) {
    
    person p = new person();
    p.add(10,10);
    p.add(10,10, 10);
  }
}
