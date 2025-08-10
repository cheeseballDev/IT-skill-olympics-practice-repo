
import java.util.Scanner;

public class IsPalindrome {
    public class testfile {
        public static void main(String[] args) {
        IsPalindrome pal = new IsPalindrome();
        Scanner userInput = new Scanner(System.in);
        System.out.print(pal.isPalindrome(userInput.nextInt()));
    }
    
    public boolean isPalindrome(int x) {
        String numberToString = String.valueOf(x);
        StringBuilder sb = new StringBuilder(numberToString);
        String reversedNumber = sb.reverse().toString();
        return reversedNumber.equals(numberToString);
    }
}
}
