import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100) + 1;
        boolean winner = false;

        System.out.println("I have chosen a random number, guess what");
        Scanner scan = new Scanner(System.in);
        for (int i = 10; i > 0; i --) {
            System.out.println("You have " + i + " guesses left. Good luck");
            int guess = scan.nextInt();

            if (guess > 100) {
                System.out.println("Wrong number. Please type anyone number from 1 to 100");
                System.exit(0);
            }
            if (randomNum < guess) {
                System.out.println("It is smaller than " + guess);

            }
            else if (randomNum > guess) {
                System.out.println("It is greater than " + guess);
        }
            else {
                winner = true;
                break;
            }
        }

        if (winner) {
            System.out.println("Well done! You have won!");
        } else {
            System.out.println("Game over. The random number is " + randomNum);
        }
    }
}
