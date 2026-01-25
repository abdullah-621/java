interface a {
  default void show()
  {
    System.out.println("a show");
  }
}

interface b {
  default void show() {
    System.out.println("b show");
  }
}
interface c {
  default void show() {
    System.out.println("c show");
  }
}

class d implements a, b, c
{
  public void show()
  {
    a.super.show();
    b.super.show();
    c.super.show();
  }
}



public class Main {
  public static void main(String[] args) {
      
    d a = new d();
    a.show();
    }
}
