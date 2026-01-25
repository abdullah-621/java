class Test {
  static void divide() throws ArithmeticException
  {
    int result = 10 / 0;
    System.out.println(result);
  }
}

public class try_catch {
  public static void main(String[] args) {
    
    if (15 < 18)
    {
      throw new ArithmeticException("Age must be 18 or above");
    }
    
    try{
      Test.divide();
    }
    catch(ArithmeticException e){
      System.out.println(e.getMessage());
    }
  }
}
