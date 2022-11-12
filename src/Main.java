import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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

    // game loop
    public static void gameLoop() {
        gamePlay();
        while (gameRunning) {
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
    public static void gameMenu(String... pick) {
        boolean menu = true;
        while (menu) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add something to inventory");
            System.out.println("2. Remove something from inventory");
            System.out.println("3. Display inventory");
            System.out.println("4. Exit menu");
            System.out.println("5. Exit game");

            char choice = takeInputChar();

            if (choice == '1' || pick.equals("add")) {
                // add something to inventory
                System.out.println("What would you like to add?");
                String item = takeInputString();
                player.addItem(item);
            } else if (choice == '2' || pick.equals("remove")) {
                //remove something from inventory
                System.out.println("What would you like to remove? (Type number) Inventory: " + player.inventory);
                String location = takeInputString();
                player.removeItem(location);
            } else if (choice == '3' || pick.equals("inventory")) {
                boolean back = false;
                System.out.println("Inventory: ");
                while (!back) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(player.inventory);
                    System.out.println("Press b to go back");
                    if (takeInputChar() == 'b') {
                        back = true;
                    }
                }

            } else if (choice == '4' || pick.equals("exit menu")) {
                gameMenuOpen = false;
            } else if (choice == '5' || pick.equals("exit game")) {
                gameRunning = false;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    // capitalize first letter of string with rest as lowercase
    public static String capitalizeFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    // add story to the game
    public static void story(int chapter) {
        if (chapter == 1) {
            chapter1_1();
        } else if (chapter == 2) {

        } else if (chapter == 3) {

        }
    }

    public static void chapter1_1() {
        System.out.println("You wake up in a dark room that smells like medicine. There is a white door in front " +
                "of you and a black door to your back. You reach into your pockets and notice that everything is " +
                "gone. Your keys, your phone, everything. All you have left are some gray sweatpants, a gray " +
                "t-shirt with a rocket on it, and a leather backpack that you don't remember owning. The room is " +
                "empty except for one piece of furniture in the room, a painting.");
        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Open your backpack");
        System.out.println("2. Open the white door");
        System.out.println("3. Open the black door");
        System.out.println("4. Cry");
        char choice = takeInputChar();
        if (choice == '1') {
            System.out.println("You open your backpack.");
            gameMenu("inventory");
        } else if (choice == '2') {
            System.out.println("You open the white door");
        } else if (choice == '3') {
            System.out.println("You open the black door");
        } else if (choice == '4') {
            boolean wait = false;
            System.out.println("Crying won't help you get out of this place.");
            System.out.println("Go back to the menu? (y/n)");
            while (!wait) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (takeInputChar() == 'y') {
                    wait = true;
                } else if (takeInputChar() == 'n') {
                    System.out.println("Don't say no.");
                } else {
                    System.out.println("Invalid choice!");
                }
            }
        } else if (choice == 't') {
            gameMenuOpen = true;
        } else {
            System.out.println("Invalid choice!");
        }
    }

    // ask for username input
    public static String askForUsername() {
        System.out.println("Please enter your username: ");
        return takeInputString();
    }

    // take user input string
    public static String takeInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //take user input character
    public static char takeInputChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    //take user input int
    public static int takeInputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}