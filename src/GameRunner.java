import java.util.Scanner;
public class GameRunner {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Monty Hall Game!\n");
        int winDoor = (int) (Math.random() * 3) + 1;
        System.out.println("There are two goats and a car randomly placed behind doors 1, 2 and 3");
        System.out.print("Where do you think the car is? Enter 1, 2 or 3: ");
        int userChoice = scan.nextInt();
        scan.nextLine();

        Game game = new Game(userChoice, winDoor);

        System.out.println("One of the goats is behind door number " + game.revealDoor(userChoice, winDoor));

        System.out.print("Do you want to switch your guess? Yes or No: ");
        String switchChoice = scan.nextLine();

        if (switchChoice.equals("Yes")) {
            System.out.println("Guess switched from " + userChoice + " to " + game.switchDoor(userChoice, winDoor));
            userChoice = game.switchDoor(userChoice, winDoor);
        }
        else {
        }

        if (game.result(userChoice, winDoor)) {
            System.out.println("You won the car!");
        }
        else {
            System.out.println("The car is behind door " + winDoor +". You lost! (Or you could say you won a goat)");
        }
    }
}
