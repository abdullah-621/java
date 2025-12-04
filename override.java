class parent {
  void display() {
    System.err.println("This is parent class");
  }
}

class child extends parent
{
  @Override
  void display()
  {
    System.out.println("This is child class");
  }
}

public class override {
  public static void main(String[] args) {
    child a = new child();
    a.display();
  }
}
