
import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();
        int product = 1;

        for(int i = 1; i < number + 1; i++) {
            product *= i; 
        }

        System.out.println(product);

    }
}
