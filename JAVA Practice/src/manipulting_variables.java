public class manipulting_variables {
    public static void main(String[] args) {
        /*
        perform calculations on numeric values:

// declare initial balance
double balance = 20000.99;
// declare deposit amount
double depositAmount = 1000.00;
// store result of calculation in our original variable
balance = balance + depositAmount;
         */
        /*
        public class GuessingGame {
	public static void main(String[] args) {
		int mystery1 = 8 + 6;
    int mystery2 = 8 - 6;
    System.out.println(mystery2);
	}
}
         */
        /*
        What if we took one additional picture of our cat?
        We can reflect this change using an increment operator ++.
        When we append ++ to a number-based variable, it increases the value by 1.
        We also have the decrement operator, --, which decreases the value by 1.
         */
        // The modulo operator %, gives us the remainder after two numbers are divided.
        //Modulo can help! Dividing an even number by 2 will have a remainder of 0.
        // Dividing an odd number by 2 will have a remainder of 1.

        /*
        We can use compound assignment operators for all of the arithmetic operators we’ve covered:

Addition (+=)
Subtraction (-=)
Multiplication (*=)
Division (/=)
Modulo (%=)
         */
        /*
        public class GreaterLessThan {
	public static void main(String[] args) {
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;

    System.out.println(creditsEarned > creditsToGraduate);

    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;

    System.out.println(creditsToGraduate < creditsAfterSeminar);
	}
}    Example of the use of expressions for
         */

        //to test equality with objects, we use a built-in method called .equals().
        // string comparissons
        /*
        String person1 = "Paul";
String person2 = "John";
String person3 = "Paul";

System.out.println(person1.equals(person2));
// Prints false, since "Paul" is not "John"

System.out.println(person1.equals(person3));
// Prints true, since "Paul" is "Paul"
         */

        /*
        public class Song {
  	public static void main(String[] args){
      String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
      String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      System.out.println(line1.equals(line2));
      System.out.println(line1 != line2);
    }       //WORKING WITH THE .equals() for objects
         */

        //STRING CONCANTENATIOn

        //final keyword
        /*
        To declare a variable with a value that cannot be manipulated,
        we need to use the final keyword. To use the final keyword,
        prepend final to a variable declaration like so:

        final int yearBorn = 1968;

         */

        /*
        public class BankAccount {
  	public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
      double updatedBalance = balance - amountToWithdraw;
      double amountForEachFriend = updatedBalance / 3;
      boolean canPurchaseTicket = amountForEachFriend >= 250;
      System.out.println(canPurchaseTicket);
      System.out.println("I gave each friend " + amountForEachFriend + "...");
    }
}

         */

    }
}
