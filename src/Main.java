import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startGame();

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

    // start the game
    public static void startGame() {
        System.out.println("Welcome to the game!");
        String username = askForUsername();
        Player player = new Player(username);
        System.out.println("Welcome " + player.username + "!");
    }

    //add story to the game
    public static void story(int chapter) {
        if (chapter == 1) {
            System.out.println("Story goes here");
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