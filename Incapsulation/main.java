class encap
{
  private String name;

  String getter()
  {
    return name;
  }


  void setter(String name)
  {
    this.name = name;
  }
}

public class main {
  public static void main(String[] args) {
    
    encap e = new encap();
    e.setter("Masum");
    System.err.println(e.getter());
  }
}
