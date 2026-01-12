class printer {

  void print(String text)
  {
    System.out.println(text);
  }
  void print(int n)
  {
    System.out.println(n);
  }

  void print(double text)
  {
    System.out.println(text);
  }
  void print(String text, int n)
  {
    System.out.println(text + " " + n);
  }
  
}


public class Method_overloding {
  public static void main(String[] args) {
    
    printer p = new printer();

    p.print(0);
    p.print(1.4);
    p.print("Masum");
    p.print("Masum", 8);
  }
}
