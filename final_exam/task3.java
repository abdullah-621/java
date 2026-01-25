class Vechile {
  String brand;
  int speed;

  Vechile(String b, int s) {
    this.brand = b;
    this.speed = s;
  }

  void move() {
    System.out.println(brand + "  is moving at [speed] km/h");
  }
}

class Car extends Vechile
{
  String fuelType = "Dijel";
  Car(String b, int s)
  {
    super(b, s);
  }

  @Override
  void move()
  {
    System.out.println(brand + " car is driving at [speed] km/h using " + fuelType);
  }

  void honk()
  {
    System.out.println("Beep Beep!");
  }
}

public class task3 {
  public static void main(String[] args) {
    Vechile v = new Vechile("BMW", 100);
    Car c = new Car("Toyota", 80);

    v.move();
  }
}
