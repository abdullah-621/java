interface Bank {
  double Int_rate = 5.5; // pulic static final

  void calcInterest(); // public and static
}

interface Loand {
  int capital = 10000;

  void calcLoanAmount(); // public and static
}

interface BankExtra extends Bank {

  int profit = 1000;

}

abstract class Demo {
  abstract void print();
}

class CityBank extends Demo implements Bank,Loand {
  

  @Override
  public void calcInterest() {
    System.out.println(Int_rate);

  }

  @Override
  public void calcLoanAmount() {
    System.out.println(capital * 0.2);
  }

 
  void print()
  {
    System.out.println(profit);
  }
}

public class Main2 {
  public static void main(String[] args) {
    Bank b = new CityBank();
    // c.Int_rate;
    b.calcInterest();
    System.out.println(CityBank.Int_rate);
    System.out.println(Bank.Int_rate);
  }
}
