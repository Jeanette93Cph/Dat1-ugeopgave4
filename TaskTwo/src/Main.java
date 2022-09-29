import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // 2.b: In the main method start by printing a message to the user: "Please type your name".
        System.out.println("Please type your name");

        //2.c: Instantiate (create) a Scanner object for reading the command line
        Scanner scan = new Scanner(System.in);

        //2.g Scanner's methods to read int
        Scanner scanInt = new Scanner(System.in);


        //2.d: Declare a String variable, name and assign the content of the Scanner to it.
        String name = scan.nextLine();

        //2.e: Print the value the user writes (print the name variable).
        System.out.println(name);

        //2.f: Print another message to the user: "Please type your age"
        System.out.println("Please type your age");

        //2.g: Declare another variable of type int, age, and assign the content of the Scanner
        int age = scanInt.nextInt();

        //2.h: Print the value the user writes (print the age variable).
        System.out.println(age);

        //2.i: Declare a third variable of type int about retirement and print it
        System.out.println("Then you can retire around: ");
        int retirement = 67 - age;
        System.out.println(retirement + " years");
    }

}
