import java.util.Scanner;

public class ReverseNumberNoString4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();

        int reversed = 0;
        while(number >= 1) {
            // gets the last digit of the number
            int lastDigit = number % 10;
            // adds the last digit first added by the reversed number and assigns it to the reversed number multiplied by 10 to increment it
            reversed = lastDigit + reversed * 10;
            // number is removed by 1 place
            number = number / 10;
        }
        System.out.println(reversed);
    }
}
