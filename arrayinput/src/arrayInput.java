import java.util.Scanner;
public class arrayInput {
    public static void main(String[] args)
    {
        System.out.print("Enter array size : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Fill " + i + " th index : ");
            int num = input.nextInt();
            arr[i] = num;
        }

        System.out.print("Array Value : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}