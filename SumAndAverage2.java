import java.util.Scanner;

public class SumAndAverage2 {
    public static void main(String[] args) {
        SumAndAverage2 sa = new SumAndAverage2();
        sa.solve();

    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Number: ");
        String number = userInput.nextLine();
        int sum = 0;
        int count = 0;
        for(int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
            count++;
        }

        System.out.print("Sum: " + sum + "\nAverage: " + sum / count);
    }
}
