class BankAccount
{
  String holderName;
  int accountNumber;
  float balance;
  
  BankAccount()
  {
    holderName = "Unknown";
    accountNumber = 0;
    balance = 0;
  }
  BankAccount(String holderName, int accountNumber, int balance)
  {
    this.holderName = holderName;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  void deposit(float taka)
  {
    this.balance += taka;
    System.out.println("You deposite " + taka + " tk");
  }

    
  void withdraw(float taka)
  {
    if(taka > this.balance)
    {
      System.out.println("Opps your balance is low !");
    }
    else {
      this.balance -= taka;
      System.out.println("You withdraw " + taka + " tk");
    }
  }

  void showBalance()
  {
    System.out.println("Your balance is :"+this.balance+" tk");
  }
}

public class prblm2 {
  public static void main(String[] args) 
  {
    BankAccount b1 = new BankAccount();
    System.out.println();

    b1.showBalance();
    b1.deposit(20000);
    b1.showBalance();
    b1.withdraw(200);
    b1.showBalance();
    b1.withdraw(90000000);

    System.out.println();
  }
}
