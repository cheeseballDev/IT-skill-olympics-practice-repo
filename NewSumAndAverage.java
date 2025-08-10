import java.util.Scanner;

public class NewSumAndAverage {
    public static void main(String[] args) {
        NewSumAndAverage obj = new NewSumAndAverage();
        obj.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input: Number: ");
        String number = userInput.nextLine();
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
            avg++;
        }
        int totalAvg = sum / avg;
        System.out.println("Output: ");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + totalAvg);
    }
}