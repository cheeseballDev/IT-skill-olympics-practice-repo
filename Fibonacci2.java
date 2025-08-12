import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Fibonacci2 fb2 = new Fibonacci2();
        fb2.solve();
    }   

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Number of terms: ");
        int numberOfTerms = userInput.nextInt();
        int a = 0,b = 1,c = 0;
        System.out.print("Fibonacci Sequence: ");
        System.out.print(c + " ");
        for(int i = 0; i < numberOfTerms; i++) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
