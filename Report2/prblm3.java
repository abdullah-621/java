import java.util.Scanner;
class Circle
{
  float radius;

  Circle() {
    this.radius = 0;
  }

  Circle(float r)
  {
    this.radius = r;
  }

  void area()
  {
    System.err.println("Area is : "+ (Math.PI * (this.radius*this.radius)));
  }

  void circumference()
  {
    System.err.println("Circumference is :" + (2*Math.PI*this.radius));
  }
}

public class prblm3 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println();

    System.out.print("Enter radius : ");
    float r = sc.nextFloat();

    Circle c1 = new Circle(r);
    c1.area();
    c1.circumference();

    System.out.println();
    sc.close();
  }
}
