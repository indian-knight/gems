import java.util.Scanner;

public class Joy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String sentence = scanner.nextLine();

        System.out.println("You entered: " + sentence);

      
        scanner.close();
    }
}
