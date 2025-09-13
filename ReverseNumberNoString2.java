
import java.util.Scanner;

public class ReverseNumberNoString2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();
        int reverse = 0;

        while(number >= 1) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }        

        System.out.println(reverse);
        
    }
}
