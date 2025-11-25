class Car {
  String brand, model;
  int year;

  Car()
  {
    brand = "Unknown";
    model = "Unknown";
    year = 0;
  }

  Car(String brand, String model, int year)
  {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  void displayDetails()
  {
    System.out.println("Car : " + this.brand + " " + this.model + " " + "(" + this.year + ")");
  }
  
}

public class prblm1 {
  public static void main(String[] args) 
  {
    System.out.println();
    Car c1 = new Car("Toyota", " Corolla",  2022);

    Car c2 = new Car("Tesla", " Model 3",  2024);
    c1.displayDetails();
    c2.displayDetails();


    System.out.println();
  }
}
