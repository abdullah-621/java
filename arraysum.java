/*
 * Class Name : arraysum
 * Author : Abdullah Al Masum
 * Description : This program takes an arrry from user input and sum of the all element all print the sum.
 */

import java.util.Scanner;
public class arraysum {
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


     int sum = 0;
    for (int i = 0; i < arr.length; i++) 
    {
      sum += arr[i];
    }

    System.out.println("Sum of all element : " + sum);

    sc.close();

  }
}
