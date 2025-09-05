public class FizzBuzz1 {
    public static void main(String[] args) {
        FizzBuzz1 fb = new FizzBuzz1();
        fb.solve();
    }

    private void solve() {
        
        for(int i = 0; i <= 100; i++) {
            String output = "";

            if(i % 3 == 0) output += "Fizz";
            if(i % 5 == 0) output += "Buzz"; 
            if(i % 7 == 0) output += "Bang";

            System.out.println(output.isEmpty() ? i : output);
        }
    }
}
