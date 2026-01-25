class Device
{
  Double powerConsumption;
  void turnOn()
  {
    System.out.println("Device is turning on");
  } 
}
class Electronics extends Device
{
  int warrantyYears;

  Electronics()
  {
    super();
  }
  void showWarranty()
  {
    System.out.println("Device is turning on");
  } 
}
class SmartPhone extends Electronics
{
  String osVersion;
  @Override
  void turnOn()
  {
    super.turnOn();
    System.out.println("SmartPhone is booting [osVersion]");
  } 
}

public class task4 {
  public static void main(String[] args) {
    SmartPhone s = new SmartPhone();
    s.turnOn();
    s.showWarranty();
  }
}
