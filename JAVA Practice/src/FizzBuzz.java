public class FizzBuzz {
    // It's important to understand FizzBuzz because many
    // interviewers will ask this basic technical question
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }  else if (i % 3 == 0) {
                System.out.println("Fizz");
            }  else if (i % 5 == 0) {
                System.out.println("Buzz");
            }  else {
                System.out.println(i);
            }
        }
    }
}