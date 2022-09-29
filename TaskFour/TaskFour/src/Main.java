import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {

        ArrayList<String> actions = new ArrayList<>();

        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // You can test the actions ArrayList by printing one of the elements: System.out.println(actions.get(2));

        Menu menu1 = new Menu(actions);

        int choice = menu1.showMenu();
        doAction(choice);


    }

    //4.h Create a method in the Main class, for testing that the user dialog in the Menu class works as expected
    public static void doAction(int action)
    {
      switch(action)
        {
            case 1: System.out.println("Starting the game now");
            break;
            case 2: System.out.println("Fetching previously saved game data");
            break;
            case 3: System.out.println("Game paused");
            break;
            case 4: System.out.println("Ending game");
        }

    }

}
