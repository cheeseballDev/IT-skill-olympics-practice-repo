import java.util.Scanner;

public class ReverseNumberNoString6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = userInput.nextInt();
        
        int reversed = 0;
        while(num >= 1) {
            int lastDigit = num % 10;
            reversed = lastDigit + reversed * 10;
            num = num / 10;
        }
        System.out.println("Reversed: "+ reversed);
    }
}
