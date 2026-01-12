class Bank {
  String accountNumber, holderName;
  double balance;

  Bank()
  {
    this.accountNumber = "Unknown";
    this.holderName = "Unknown";
    this.balance = 0;
  }

  Bank(String acc, String name, double bal)
  {
    this.accountNumber = acc;
    this.holderName = name;
    this.balance = bal;
  }

  void deposit(double b)
  {
    this.balance += b;
    System.out.println("Diposite " + b + " tk");
  }


  void withdraw(double b)
  {
    if(b <= this.balance)
    {
      this.balance -= b;
      System.out.println("Withdraw " + b + " tk");
    }
    else
    {
      System.out.println("Insufficient balance");
    }
  }

  void showBalance()
  {
    System.out.println("Account Number : " + this.accountNumber);
    System.out.println("Holder Name : " + this.holderName);
    System.out.println("Your balance is : " + this.balance);
  }
}

public class Main{
  public static void main(String[] args) {

    String[] name = { "Abdullah Al Masum", "Shafiqul Islam", "Ruhul Amin" };

    String[] acc = { "2023200000621masum", "2023200000600shafi" , "2023200000666ruhul"};

    Bank[] people = new Bank[3];

    for (int i = 0; i < people.length; i++)
    {
      people[i] = new Bank(acc[i],name[i], (i + 10 * 888));
    }



    for(Bank b : people)
    {
      System.out.println("----------------------");
      b.deposit(99999);
      b.withdraw(100);
      b.showBalance();
      System.out.println("----------------------");
    }


    
    // Bank b = new Bank("2023200000621", "Abdullah Al Masum", 800);
    // b.deposit(1000);
    // b.withdraw(1000);
    // b.showBalance();
  }
}