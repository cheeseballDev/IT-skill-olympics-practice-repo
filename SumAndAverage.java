import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        SumAndAverage sa = new SumAndAverage();
        sa.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input: ");
        String number = userInput.nextLine();
        
        int sum = 0;
        int count = 0;
        System.out.println("Output: ");
        for(int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
            count++;
        }

        int average = sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
