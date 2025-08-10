package SchoolFolder;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userNumber = userInput.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int number = 0;
        for (int i = 0; i < userNumber; i++) {
            System.out.println(number);
            number = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = number;
        }
        
    }
}
