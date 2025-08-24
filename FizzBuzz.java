
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        for(int i = 1; i <= 100; i++) {
            String output = "";

            if(i % 3 == 0) output += "Fizz";
            if(i % 5 == 0) output += "Buzz";
        
            System.out.println(output.isEmpty() ? i : output);
        }
    }
}
