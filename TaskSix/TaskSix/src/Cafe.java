import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe
{
    ArrayList<String> coffeeMenu = new ArrayList<>();

    // 6.c In the Cafe class, add a method loadMenuData. Have the method load the coffees.txt file.
    void loadMenuData()
    {
       File file = new File("coffees.txt");

       //6.d In this step you will read from the file, using a Scanner object: Add the file instance to a new Scanner object. (This piece of code will need to be wrapped in a try -catch block

       try
       {
           Scanner scan = new Scanner(file);

           // 6.e
           while(scan.hasNextLine())
           {
                coffeeMenu.add(scan.nextLine());
           }

       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       for(String coffee: coffeeMenu)
       {
           System.out.println(coffee);
       }
    }




}
