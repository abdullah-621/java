import java.util.Scanner;
public class arrayreverse {
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

    System.out.print("Original array : ");
    for (int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }


    System.out.print("\nReverse array : ");
    for (int a = arr.length - 1; a >= 0 ; a--)
    {
      System.out.print(arr[a] + " ");
    }

    sc.close();

  }
}
