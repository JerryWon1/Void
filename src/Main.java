import java.util.Scanner;

public class Main {
    //game start
    static String username = askForUsername();
    static Player player = new Player(username);

    public static void main(String[] args) {
        gameLoop();
    }

    // take user input string
    public static String takeInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //take user input int
    public static int takeInputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // ask for username input
    public static String askForUsername() {
        System.out.println("Please enter your username: ");
        return takeInputString();
    }

    // game loop
    public static void gameLoop() {
        System.out.println("Welcome to the game, " + player.username + "!");
        story(1);
        while (true) {
            gameMenu();
        }
    }

    //game menu
    public static void gameMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1. Add something to inventory");
        System.out.println("2. Remove something from inventory");
        System.out.println("3. Display inventory");
        System.out.println("4. Exit game");

        int choice = takeInputInt();

        if (choice == 1) {
            // add something to inventory
            System.out.println("What would you like to add?");
            String item = takeInputString();
            player.addItem(item);
        } else if (choice == 2) {
            //remove something from inventory
            System.out.println("What would you like to remove? (Type number) Inventory: " + player.inventory);
            String location = takeInputString();
            player.removeItem(location);
        } else if (choice == 3) {
            System.out.println(player.inventory);

        } else if (choice == 4) {
            System.exit(0);
        } else {
            System.out.println("Invalid choice!");
        }
        //new line
        System.out.println();
    }

    // add story to the game
    public static void story(int chapter) {
        if (chapter == 1) {
            System.out.println(player.username + " wakes up in a dark room. There is a door to the north and a door to the south.");
        } else if (chapter == 2) {
            System.out.println("Story goes here");
        } else if (chapter == 3) {
            System.out.println("Story goes here");
        } else if (chapter == 4) {
            System.out.println("Story goes here");
        } else if (chapter == 5) {
            System.out.println("Story goes here");
        } else if (chapter == 6) {
            System.out.println("Story goes here");
        }
    }
}