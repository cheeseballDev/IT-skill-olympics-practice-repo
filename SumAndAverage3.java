import java.util.Scanner;

public class SumAndAverage3 {
    public static void main(String[] args) {
        SumAndAverage3 sa = new SumAndAverage3();
        sa.solve();
    }

    private void solve() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number: ");
        String number = userInput.nextLine();
        int sum = 0;
        int count = 0;

        for(int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
            count++;
        }

        int avg = sum / count;

        System.out.println("The sum of all digits: " + sum);
        System.out.println("The average: " + avg);

    }
}