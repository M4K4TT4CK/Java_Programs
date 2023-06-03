// Import statement:
import java.util.ArrayList;
class PrimeDirective {
    // Add your methods here:
    //check if number is prime
    //return statements if not true
    public boolean isPrime(int number){
        if(number == 2){
            return true;
        } else if(number < 2){
            return false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
            else {
                return true;
            }
        }
        return true;
    }
    // Only prime numbers
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers){
            primes.add(number);
        }
        return primes;
    }
    // Filters even or odd number
    public ArrayList<Integer> isEven(int[] numbers) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for (int nums : numbers){
            if (nums % 2 == 0){
                evens.add(nums);
            }
        }
        return evens;
    }
    // return odd numbers
    public ArrayList<Integer> isOdd(int[] numbers) {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int num : numbers){
            if (num % 2 == 1){
                odds.add(num);
            }
        }
        return odds;
    }
    // main method
    public static void main(String[] args) {
        System.out.println("This Program will find prime numbers and then sort them.");
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println("Is this number prime? " + pd.isPrime(28));
        System.out.println("Here are the prime numbers: " + pd.onlyPrimes(numbers));
        System.out.println("Here are the even prime numbers: " + pd.isEven(numbers));
        System.out.println("Here are the odd prime numbers: " + pd.isOdd(numbers));

    }

}