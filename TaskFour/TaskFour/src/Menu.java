import java.util.ArrayList;
import java.util.Scanner;

public class Menu
{

    public ArrayList<String> options = new ArrayList<>();

    //constructor
    public Menu(ArrayList<String> options)
    {
        this.options = options;

    }

    public int showMenu()
    {
        System.out.println("Type a number to choose");
        System.out.println(options);

        Scanner scan = new Scanner(System.in);


        //4.f Declare a String variable choice and assign it the user's input.
        int choice = scan.nextInt();

        //4.g Let the showMenu method return the user's choice (as a String).
        return choice;
    }



}

