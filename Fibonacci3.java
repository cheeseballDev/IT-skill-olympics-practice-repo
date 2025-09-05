import java.util.Scanner;

public class Fibonacci3 {
    public static void main(String[] args) {
        Fibonacci3 fb = new Fibonacci3();
        fb.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of cycles: ");
        int number = userInput.nextInt();
        int a = 0 ,b = 1, c = 0;

        for(int i = 0; i < number; i++) {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
        
    }
}
