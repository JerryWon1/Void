import java.util.Scanner;

public class Main {
    //game start
    static String username = askForUsername();
    static Player player = new Player(capitalizeFirstLetter(username));
    static boolean gameRunning = true;
    static boolean gameMenuOpen = false;
    static int chapter = 1;
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
        gamePlay();
        while (gameRunning) {
            if (takeInputString().equals("t")) {
                gameMenuOpen = true;
            } else {
                System.out.println("That does nothing!");
            }
            if (gameMenuOpen) {
                gameMenu();
            } else {
                gamePlay();
            }

        }
    }

    // game play
    public static void gamePlay() {
        story(chapter);
    }

    // game menu
    public static void gameMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1. Add something to inventory");
        System.out.println("2. Remove something from inventory");
        System.out.println("3. Display inventory");
        System.out.println("4. Exit menu");
        System.out.println("5. Exit game");

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
            gameMenuOpen = false;
        } else if (choice == 5) {
            gameRunning = false;
        } else {
            System.out.println("Invalid choice!");
        }
        //new line
        System.out.println();
    }

    // capitalize first letter of string with rest as lowercase
    public static String capitalizeFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    // add story to the game
    public static void story(int chapter) {
        if (chapter == 1) {
            System.out.println("You wake up in a dark room that smells like medicine. There is a white door in front of you and a\n" +
                    "black door to your back. You reach into your pockets and notice that everything is gone. Your keys, your\n" +
                    "phone, everything. All you have left are some gray sweatpants, a gray t-shirt with a rocket on it, and a\n" +
                    "leather backpack that you don't remember owning. The room is empty except for one piece of furniture in\n" +
                    "the room, a painting.");
            System.out.println("What do you want to do?");
            System.out.println("1. Open your backpack");
            System.out.println("2. Open the white door");
            System.out.println("3. Open the black door");
            System.out.println("4. Cry");
            int choice = takeInputInt();
            if (choice == 1) {
                System.out.println("1. Open your backpack");
            } else if (choice == 2) {
                System.out.println("2. Open the white door");
            } else if (choice == 3) {
                System.out.println("3. Open the black door");
            } else if (choice == 4) {
                System.out.println("4. Cry");
            } else {
                System.out.println("Type a valid integer");
            }
        } else if (chapter == 2) {

        } else if (chapter == 3) {

        }
    }
}