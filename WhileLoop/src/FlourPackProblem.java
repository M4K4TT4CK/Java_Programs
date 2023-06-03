public class FlourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0, 5, 4)); // true
        System.out.println(canPack(2, 2, 11)); // true
        System.out.println(canPack(-3, 2, 13)); // false

    }
    // Method to determine if the sum of two items is equal to a goal
    public static boolean canPack(int bigCount, int smallCount, int goal) {
// The arguments have to be above zero
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

/* I tried to instantiate arguments as variables and realized that it wouldn't work
because it would them permanently fixed on those numbers instead of taking in those
arguments entered into the method.
*/
        /*
        Instantiating a new variable with bigCount * 5 because one of bigCount is 5 kilos and adding it to
        smallCount because it is only one kilo
         */
        int sacksTotal = (bigCount * 5) + smallCount;

/* Check to see if the sacksTotal is greater than the amount of goal remainder (5 because bigcount is 5)
is less than or equal to smallCount
 */

        if (sacksTotal >= goal && (goal % 5) <= smallCount) {
            return true;
        }else{
            return false;
        }
    }
}


