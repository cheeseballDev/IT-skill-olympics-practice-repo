import java.util.Scanner;

public class newPalindrome {
    public static void main(String[] args) {
        newPalindrome obj = new newPalindrome();
        obj.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        String word = userInput.nextLine();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if (word.equals(reversedWord)) {
            System.out.println("is a palindrome!");
        } else {
            System.out.println("is NOT a palindrome");
        }
    }
}
