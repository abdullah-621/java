public class sum {
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};
        int ans = 0;
        for(int i = 0; i < arr.length; i++)
        {
            ans += arr[i];
        }

        System.out.println("Sum of array : " + ans);
    }
}