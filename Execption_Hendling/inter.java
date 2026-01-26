interface A {
  default void show() {
    System.out.println("A");
  }
}

interface B{
  default void show()
  {
    System.out.println("B");
  }
}

interface C{
  default void show()
  {
    System.out.println("C");
  }
}

class D implements A,B, C {
  public void show()
  {
    A.super.show();
    B.super.show();
    C.super.show();
  }
}

public class inter {
  public static void main(String[] args) {
    C c = new D();
    c.show();
  }
}
