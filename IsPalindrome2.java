import java.util.Scanner;

public class IsPalindrome2 {
    public static void main(String[] args) {
        IsPalindrome2 p = new IsPalindrome2();
        p.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        String word = userInput.nextLine();
        String reversedWord = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
            
        }


        if(word.equals(reversedWord)) {
            System.out.println("IS PALINDROME");
        } else {
            System.out.println("Not palindrome");
        }


    }
}
