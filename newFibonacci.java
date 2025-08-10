import java.util.Scanner;

public class newFibonacci {
    public static void main(String[] args) {
        newFibonacci obj = new newFibonacci();
        obj.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input: Number of terms: ");
        int numberOfTerms = userInput.nextInt();
        System.out.println("Output: Fibonacci Sequence: ");
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < numberOfTerms; i++) {
            System.err.println(c);
            c = a + b;
            a = b;
            b = c;

        }
    }
}