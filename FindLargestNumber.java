import java.util.Scanner;
public class FindLargestNumber {
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


    int maxNumber = arr[0];

    for (int i = 0; i < arr.length; i++)
    {
      if (maxNumber < arr[i]) {
        maxNumber = arr[i];
        
      }
    }

    System.out.println("Largest Number is : " + maxNumber);

    sc.close();

  }
}
