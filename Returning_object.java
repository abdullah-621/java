class Counter {

  int value;

  Counter(int value)
  {
    this.value = value;
  }

  Counter increment()  // Returning Object
  {
    return new Counter(this.value + 1);
  }
}


public class Returning_object {
  public static void main(String[] args) {
    
    Counter c1 = new Counter(1);

    Counter c2 = c1.increment();

    System.out.println(c2.value);
  }
}
