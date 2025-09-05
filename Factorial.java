
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();
        int factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
