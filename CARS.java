class car {
  String brand;
  String model;
  int year;

  // car(String b, String m, int y)
  // {
  //   brand = b;
  //   model = m;
  //   year = y;
  // }

  car() {
    brand = "BMW";
    model = "Y289";
    year = 1990;
  }

  void show() {
    System.out.println("Brand : " + brand);
    System.out.println("Model : " + model);
    System.out.println("Year : " + year);
  }
}

public class CARS {
  public static void main(String[] args)
  {
    // car c1 = new car("BMW", "Y230", 1990);
    car c1 = new car();
    c1.show();
  }
}
