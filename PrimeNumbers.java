package SchoolFolder;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j ==0) {
                return false;
            }
        }
        return true;
    }
}

