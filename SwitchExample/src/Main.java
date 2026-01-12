import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value (1 - 3) : ");
        int day = input.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("It's Monday");
                break;
            case 4:
                System.out.println("It's Wednesday");
                break;
            case 3:
                System.out.println("It's Thursday");

            default:
                System.out.println("Invalid Input");

        }
    }
}