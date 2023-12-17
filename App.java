import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Welcome to the Question and Answer Game!");
        System.out.println("What is the capital of France?");

        String userAnswer = scanner.nextLine();

        if (userAnswer.equalsIgnoreCase("Paris")) {
            System.out.println("Correct! Paris is the capital of France.");
        } else {
            System.out.println("Incorrect. The correct answer is Paris.");
        }

        scanner.close();
    }
}
