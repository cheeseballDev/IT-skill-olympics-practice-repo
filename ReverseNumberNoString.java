import java.util.Scanner;

public class ReverseNumberNoString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        boolean isNegative = number < 0;
        if(isNegative)
            number = number * -1;

        int reverse = 0;
        while(number >= 1) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit; // adds the first digit
            number = number / 10;// removes the last digit
        }
        
        if(isNegative)
            number = number * -1;

        System.out.println(reverse);

    }
}