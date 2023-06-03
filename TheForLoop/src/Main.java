public class Main {

    public static void main(String[] args) {
        for(int counter = 0; counter <=5; counter++){
            System.out.println(counter);
        }

//        for(double rate=2.0; rate <=5.0; rate++){
//            double interestRate = calculateInterest(10000, rate);
//            System.out.println("$10,000 at " + rate + "% is: $" + interestRate);
//        }

        for(double rate = 7.5; rate <= 10; rate += 0.25){
            double interestRate = calculateInterest(100, rate);
            if(interestRate > 8.5){
                break;
            }
            System.out.println("$100 at " + rate + "% is: $" + interestRate);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

}
