import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        Random compChoice = new Random();

        System.out.println("===== Welcome to the Game =====");
        System.out.print("Enter your Choice --> 0 for Rock, 1 for Paper, 2 for Scissors: ");
        int userChoice = choice.nextInt();

        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid input!!");
            return;
        }

        int computerChoice = compChoice.nextInt(3);

        System.out.printf("You chose : %d ", userChoice);
        System.out.printf("Computer chose : %d ", compChoice);

        if (userChoice == computerChoice) {
            System.out.println("It's a TIE!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You WIN!");
        } else {
            System.out.println("Computer WINS!");
        }

        choice.close();
    }
}
