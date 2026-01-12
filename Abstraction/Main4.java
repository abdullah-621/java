interface A {
  default void show() {

    System.out.println("Interface A");
  
  }
}
interface B {
  default void show() {

    System.out.println("Interface B");

  }

}
class Demo implements A, B {
  public void show() {

    A.super.show();

  }

}
public class Main4 {
public static void main(String[] args)
{

  Demo d = new Demo();

  d.show();

}

}