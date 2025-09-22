import java.util.Scanner;

public class ReverseNumberNoString5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();

        int reversed = 0;

        while(number >= 1) {
            int lastDigit = number % 10;
            reversed = lastDigit + reversed * 10;
            number = number / 10;
        }
        System.out.println(reversed);
    }
}
