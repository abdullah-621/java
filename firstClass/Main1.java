class vehicle {
  private String name;
  private String brand;
  int year;

  vehicle(String name, String brand,int year)
  {
    this.name = name;
    this.brand = brand;
    this.year = year;
  }

  void sound() {}
  void display() {}

  public String getter()
  {
    return (name + " " +  brand + " " + year);
  }
}

class car extends vehicle {
  car(String name, String brand, int year) {
    super(name, brand, year);
  }

  @Override
  void sound() {
    System.out.println("Car Sound");
  }

  void display() {
    System.out.println(super.getter());
  }

}

class Bike extends car {
  Bike(String name, String brand, int year) {
    super(name, brand, year);
  }

  @Override
  void sound() {
    System.out.println("Bike Sound");
  }

  void display() {
    System.out.println(super.getter());
  }


}

public class Main1 {
  public static void main(String[] args) {

    Bike b = new Bike("R15", "Yemaha", 2005);
    b.sound();
    b.display();
  }
}