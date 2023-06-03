public class Sum3And5Challenge {

    public static void main(String[] args) {

        int countOfMatches = 0;
        int sumOfMatches = 0;
        for(int loopNumber = 1; loopNumber <= 1000; loopNumber++){
            if(loopNumber % 3 == 0 && loopNumber % 5 == 0){
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match " + loopNumber);
            } if(countOfMatches == 5){
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);

//        for(int number = 100; number > 0; number+=10){
//            System.out.println("number " + number);
//        }

//        sum3And5(1657, 6783768);

    }

//    public static void sum3And5(int num1, int num2){
//
//        int countOfMatches = 0;
//        int sumOfMatches = 0;
//        for(int loopNumber = num1; loopNumber <= num2; loopNumber++){
//            if(loopNumber % 3 == 0 && loopNumber % 5 == 0){
//                countOfMatches++;
//                sumOfMatches += loopNumber;
//                System.out.println("Found a match " + loopNumber);
//            } if(countOfMatches >= 5){
//                break;
//            }
//        }
//        System.out.println("Sum equals " + sumOfMatches);
//    }

}
