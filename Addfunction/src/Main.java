import java.util.Scanner;
public class Main {
    static int add(int... arr)
    {
        int ans = 0;

        for(int i : arr)
        {
            ans += i;
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many value you add : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Fill " + i + " th index : ");
            int val = input.nextInt();
            arr[i] = val;
        }

        int ans = add(arr);

        System.out.println("Sum is : " + ans);
    }
}