import java.util.Scanner;
public class evenodd {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter array size : ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) 
    {
      System.out.print("Enter " + i + " value :");
      int value = sc.nextInt();
      arr[i] = value;
    }


    int odd = 0;
    int even = 0;

    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] % 2 == 0) {
        even++;
      }
      else {
        odd++;
      }
    }

    System.out.println("Even : " + even);
    System.out.println("Odd " + odd);
sc.close();
  }
}
