import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startGame();

    }

    // take user input string
    public static String takeInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    // ask for username input
    public static String askForUsername() {
        System.out.println("Please enter your username: ");
        String input = takeInput();
        return input;
    }

    // start the game
    public static void startGame() {
        System.out.println("Welcome to the game!");
        String username = askForUsername();
        Player player = new Player(username);
        System.out.println("Welcome " + player.username + "!");
    }

}