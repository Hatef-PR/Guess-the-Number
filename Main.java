import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(0, 10);
        int newGuess = -1; // chose this number because it's not in the range of 0 to 9
        while (true) {
            System.out.println("Guess a number between 0 to 9");
            String guess = input.nextLine();
            try {
                if (CheckIsDigit(guess)) {
                    newGuess = Integer.parseInt(guess);
                } else {
                    System.out.println("Entered number is invalid!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entered number is invalid!");
            }
            if (newGuess == randomNum) {
                System.out.println("That's correct! You won :)");
                break;
            } else {
                System.out.println("You're wrong!");
            }
        }
    }
    // this method checks the entered value is digit or not
    static boolean CheckIsDigit (String input) {
        boolean isAllDigits = true;
        for (int i = 0; i < input.length(); i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    isAllDigits = false;
                    break;
                }
        }
        return isAllDigits;
    }
}