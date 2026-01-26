class myException extends Exception {
  myException(String massage)
  {
    super(massage);
  }
}

class test {
  static void checkAge(int age) throws myException {

    if (age < 18) {
      throw new myException("Age must be greater then 18");
    } else {
      System.out.println("You are eligible");
    }
  }
}

public class try_catch {
  public static void main(String[] args) {
    try{
      test.checkAge(10);
    }
    catch(myException e)
    {
      System.out.println(e.getMessage());
    }
    finally {
      System.out.println("Its okkkkkkkk.......");
    }
  }
}
