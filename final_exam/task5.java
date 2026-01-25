abstract class Shape {
  abstract void draw();

  String getType() {
    return "Generic Shape";
  }
}

class Circle extends Shape {

  @Override
  void draw()
  {
    System.out.println("Drawing a circle");
  }
}
class Rectangle extends Shape {

  @Override
  void draw()
  {
    System.out.println("Drawing a rectangle");
  }
}
class Triangle extends Shape {

  @Override
  void draw()
  {
    System.out.println("Drawing a triangle");
  }
}

public class task5 {
  public static void main(String[] args) {
    
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle();
    shapes[1] = new Rectangle();
    shapes[2] = new Triangle();

    for(Shape s : shapes)
    {
      s.draw();
    }
  }
}
