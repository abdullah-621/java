class access
{
  private String name = "Masum";

  void getter()
  {
    System.out.println(name);
  }
}

public class basic {
  public static void main(String[] args) {
    access a = new access();
    a.getter(); 
  }
}
