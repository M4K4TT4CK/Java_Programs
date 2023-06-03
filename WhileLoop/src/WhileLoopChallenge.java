public class WhileLoopChallenge {

    public static void main(String[] args) {


        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(6));
        System.out.println(isEvenNumber(9));
        System.out.println(isEvenNumber(13));
        System.out.println(isEvenNumber(20));
        System.out.println("----------");
        int number = 4;
        int numFinish = 20;
        int evenCount = 0;
        int oddCount = 0;
/*
This while loop will run while number is always less than numFinish.
It's counting the numbers it has between those two. It then will check
to see if it is an odd or even number. If it is not even it will continue
through the numbers and only work through even numbers. But we want a total count
of all numbers at the end: oddCount is tallied right before continue. If they are
even it will count those as well and print out the even number. The loop will terminate
after five even numbers are found. It will return the even numbers found and the
total count of even and odd numbers found.
 */
        while (number <= numFinish){
            number++;
            if(!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            evenCount++;
            System.out.println("Even number + " + number);
            if(evenCount >= 5){
                break;
            }
            }
        System.out.println("Even Number count is: " + evenCount + " and Odd Number count is: " + oddCount);
        }


    public static boolean isEvenNumber(int number){

        if(number > 0 && number % 2 ==0){
            return true;
        }
        return false;
    }
}
