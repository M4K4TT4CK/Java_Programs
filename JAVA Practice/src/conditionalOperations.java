//public class conditionalOperations {
//    Java includes operators that only use boolean values.
//    These conditional operators help simplify expressions containing complex boolean relationships
//    by reducing multiple boolean values to a single value: true or false.

//    For example, what if we want to run a code block only if multiple conditions are true.
//    We could use the AND operator: &&.

//    Or, we want to run a code block if at least one of two conditions are true.
//    We could use the OR operator: ||.

//    Finally, we can produce the opposite value, where true becomes false and false becomes true,
//    with the NOT operator: !.
    // && operator...true on both ends
//    true && true
//// true
//            false && true
//// false
//            true && false
//// false
//            false && false
//// false

//    example of && operator
//    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
//        System.out.println("Reservation confirmed.");
//        isConfirmed = true;
//    }
//      else {
//        System.out.println("Reservation denied.");
//        isConfirmed = false;
//    }
//}
// condition || or statements
    //is true if one is true
//    We’re using two different if-then statements with the same code block.
//    We can be more concise with the OR operator:

    // Write conditional statement here
//    if (count < 1 || count > 8) {
//        System.out.println("Invalid reservation!");
//    }

    // Logical Not!
    //The unary operator NOT, !, works on a single value.
    // This operator evaluates to the opposite boolean to which it’s applied:

//    public void informUser() {
//        // Write conditional here
//        if (!isConfirmed) {
//            System.out.println("Unable to confirm reservation, please contact restaurant.");
//        }
//        else {
//            System.out.println("Please enjoy your meal!");
//        }
//    }

    //combining conditional operators
//    We have the ability to expand our boolean expressions by using multiple conditional operators in a
//    single expression.
//
//    For example:
//
//    boolean foo = true && !(false || !true)

//    public class Operators {
//        public static void main(String[] args) {
//            int a = 6;
//            int b = 3;
//
//            boolean ex1 = !(a == 7 && (b >= a || a != a));
//            System.out.println(ex1);
//
//            boolean ex2 = a == b || !(b > 3);
//            System.out.println(ex2);
//
//            boolean ex3 = !(b <= a && b != a + b);
//            System.out.println(ex3);
//
//        }
//    }
//

///             conditional operations are evaluated in the following manner;
//   Not quite. The order of evaluation is: the NOT operator (!) -> the AND operator (&&) -> the OR operator (||)
//public class Reservation {
//    int guestCount;
//    int restaurantCapacity;
//    boolean isRestaurantOpen;
//    boolean isConfirmed;
//
//    public Reservation(int count, int capacity, boolean open) {
//        if (count < 1 || count > 8) {
//            System.out.println("Invalid reservation!");
//        }
//        guestCount = count;
//        restaurantCapacity = capacity;
//        isRestaurantOpen = open;
//    }
//
//    public void confirmReservation() {
//        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
//            System.out.println("Reservation confirmed");
//            isConfirmed = true;
//        } else {
//            System.out.println("Reservation denied");
//            isConfirmed = false;
//        }
//    }
//
//    public void informUser() {
//        if (!isConfirmed) {
//            System.out.println("Unable to confirm reservation, please contact restaurant.");
//        } else {
//            System.out.println("Please enjoy your meal!");
//        }
//    }
//
//    public static void main(String[] args) {
//        // Create instances here
//
//    }
//}
