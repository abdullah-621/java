import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = input.nextLine();

        System.out.print("Enter Your age : ");
        int age = input.nextInt();

        System.out.println("Hello " + name + ", You are " + age + " years old");
    }
}