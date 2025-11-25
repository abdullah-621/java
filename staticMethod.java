class show {
  static void s()
  {
    System.out.println("Static Method");
  }

  void m()
  {
    System.out.println("Normal Method");
  }
}

public class staticMethod {
  public static void main(String[] args)
  {
    show.s();
    show s1 = new show();
    s1.m();
  }
}
