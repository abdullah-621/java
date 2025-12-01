class made
{
  static {
    System.out.println("Static block excute");
  }
}

public class staticBlock {
  public static void main(String[] args) {
    made m = new made();
    made m2 = new made();
  }
}
