public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(0));// -1
        System.out.println(getLargestPrime(45)); // 5
        System.out.println(getLargestPrime(-1)); //-1

    }

    public static int getLargestPrime(int number) {

        if (number <= 1) return -1;

        int largestPrime = 1;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) count++;
                }
                if (count == 2) largestPrime  = i;
            }
        }
        return largestPrime;
    }
}

