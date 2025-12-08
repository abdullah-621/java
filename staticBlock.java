class made
{
  static class inner {
    void p()
    {
      System.out.println("Inner static class");
    }
  }
}

public class staticBlock {
  public static void main(String[] args) {
    System.out.println(made());
  }
}
