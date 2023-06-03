public class ConditionalPlayground {

    /*
    We represent this kind of decision-making in our program using conditional or
     control flow statements. Before this point, our code runs line-by-line from the top down,
      but conditional statements allow us to be selective in which portions will run.
     */
    //if/then statements
    //The if-then statement is the most simple control flow we can write.
    // It tests an expression for truth and executes some code based on it.
    //If a conditional is brief we can omit the curly braces entirely:
    //if (true) System.out.println("Brevity is the soul of wit");
    // Write an if-then statement:
//    if (itemCost > 24.00) {
//        System.out.println("High value item!")
//    }


    //  if/then/else Boolean example//two simple statements
    // Write an if-then-else statement:
//    if (isFilled) {
//
//        System.out.println("Shipping");
//
//    }
//    else {
//
//        System.out.println("Order not ready");
//
//    }
//
//}

//      if/then/else/if statement....so much worse than python
//The conditional structure we’ve learned can be chained together
//    to check as many conditions as are required by our program.

//public double calculateShipping() {
//    // declare conditional statement here
//    if (shipping.equals("Regular")){
//        return 0;
//    }
//    else if (shipping.equals("Express")){
//        return 1.75;
//    }
//    else{
//        return .50;
//    }
//}

    //nested conditional statements
//    We can create more complex conditional structures by creating nested conditional statements,
//    which is created by placing conditional statements inside other conditional statements:

    //example
//    if (outer condition) {
//        if (nested condition) {
//            Instruction to execute if both conditions are true
//        }
//    }

//    public double calculateShipping() {
//        if (shipping.equals("Regular")) {
//            return 0;
//        } else if (shipping.equals("Express")) {
//            // Add your code here
//            if (couponCode.equals("ship50")) {
//                return 0.85;
//            } else {
//                return 1.75;
//            }
//        } else {
//            return .50;
//        }
//    }

    // Switch statement
//    An alternative to chaining if-then-else conditions together is to use the switch statement.
//    This conditional will check a given value against any number of conditions
//    and run the code block where there is a match.
//
//        switch (shipping) {
//
//        case "Regular":
//            shippingCost = 0;
//            break;
//        case "Express":
//            shippingCost = 1.75;
//            break;
//        default:
//            shippingCost = .50;
//    }



}
