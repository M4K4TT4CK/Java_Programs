public class Loops {
    // INTRODUCTION TO LOOPS

    // A loop is a programming tool that allows developers to repeat the same block of code until
    // some condition is met.

//    ll go over three types of loops that we’ll see everywhere:
//            while loops
//            for loops
//            for-each loops
    // If the loop never reaches false, it will continue forever...until it crashes

    //A while loop looks a bit like an if statement:
    //while loops are extremely useful when you want to run some code until a specific change happens.
    // However, if you aren’t certain that change will occur, beware the infinite loop!
    //Infinite loops occur when the condition will never evaluate to false.
    // This can cause your entire program to crash.

    // infinite loop example
//    int hedgehogs = 5;
//
//// This will cause an infinite loop:
//while (hedgehogs < 6) {
//
//        System.out.println("Not enough hedgehogs!");
//
//    }

    // Repeat while roll isn't 5
//    while (dieRoll != 5) {
//        System.out.println(dieRoll);
//        dieRoll = randomGenerator.nextInt(6) + 1;
//    }

    // Incrementing While Loops

    //When looping through code, it’s common to use a counter variable.
    // A counter (also known as an iterator) is a variable used in the \
    // conditional logic of the loop and (usually) incremented in value during
    // each iteration through the code.
    // For example:

    // counter is initialized
//    int wishes = 0;
//
//// conditional logic uses counter
//while (wishes < 3) {
//
//        System.out.println("Wish granted.");
//        // counter is incremented
//        wishes++;
//
//    }

    // decrement counter also work
    // For example:
//    int pushupsToDo = 10;
//
//while (pushupsToDo > 0) {
//
//        doPushup();
//        pushupsToDo--;
//
//    }

    // While loop example increment "cupsOfCoffee++;"

//    class Coffee {
//
//        public static void main(String[] args) {
//
//            // initialize cupsOfCoffee
//            int cupsOfCoffee = 1;
//
//            // add while loop with counter
//            while (cupsOfCoffee <= 100) {
//                System.out.println("Fry drinks cup of coffee # " + cupsOfCoffee);
//                cupsOfCoffee++;
//            }
//
//
//
//        }
//
//    }

    //For Loops
    //Incrementing with loops is actually so common in programming that Java
    // (like many other programming languages)
    // includes syntax specifically to address this pattern: for loops.

//    A for loop header is made up of the following three parts, each separated by a semicolon:
//
//    1. The initialization of the loop control variable.
//           2.  A boolean expression.
//    3. An increment or decrement statement.
// EXAMPLE:
    //for (int i = 0; i < 5; i++) {
    //
    //  // code that will run
    //
    //}
//      Let’s breakdown the above example:
//
//  i = 0: i is initialized to 0
//  i < 5: the loop is given a boolean condition that relies on the value of i. The loop will continue to execute until i < 5 is false.
//  i++: i will increment at the end of each loop and before the condition is re-evaluated.


    // USING for LOOPS
    // use instead of while loop example
//        for (int i = 1; i <= 100; i++) {
//
//        System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
//        cupsOfCoffee++;
//
//    }

    // Iterating Over Arrays and ArrayLists
// EXAMPLE
//    for (int i = 0; i < secretCode.length; i++) {
//        // Increase value of element value by 1
//        secretCode[i] += 1;
//    }
    // traversing an Array example using a for loop
//    for (int i = 0; i < secretCode.size(); i++) {
//        // Increase value of element value by 1
//        int num = secretCode.get(i);
//        secretCode.set(i, num + 1);
//    }

    // traversing an array using a while loop
//    int i = 0; // initialize counter
//
//while (i < secretCode.length) {
//        secretCode[i] += 1;
//        i++; // increment the while loop
//    }

    // Iterate over expenses
//    for (int i = 0; i < expenses.size(); i++){
//        total += expenses.get(i); <---- adding "i" total of expense from expenses
//
//    }

    // break and continue practice
//    for (int i = 0; i < 10; i++) {
//        System.out.println(i);
//        if (i == 4) {
//            break;
//        }
//    }
//    The continue keyword can be placed inside of a loop if we want to skip an iteration.
//    If continue is executed, the current loop iteration will immediately end,
//    and the next iteration will begin. We can use the continue keyword to skip any even valued iteration:
    // EXAMPLE
//    int[] numbers = {1, 2, 3, 4, 5};
//
//for (int i = 0; i < numbers.length; i++) {
//        if (numbers[i] % 2 == 0) {
//            continue;
//        }
//        System.out.println(numbers[i]);
//    }

    /*
    In this example i will continue if it is not divisible by i
     */
//    class Numbers {
//        public static void main(String[] args) {
//            for (int i = 0; i < 100; i++) {
//                // Add your code below
//                if (i % 5 != 0) {
//                    continue;
//                }
//                System.out.println(i);
//
//
//            }
//        }
//    }

    // for-each loops
//    Sometimes we need access to the elements’ indices
//    or we only want to iterate through a portion of a list. I
//    f that’s the case, a regular for loop or while loop is a great choice

//    for (int inventoryItem = 0; inventoryItem < inventoryItems.length; inventoryItem++) {
//        // Print element at current index
//        System.out.println(inventoryItems[inventoryItem]);
//    }

    // a re-write of the above program
// for (String inventoryItem : inventoryItems) {
//        // Print element value
//        System.out.println(inventoryItem);
//
//    }

    // Iterate over expenses <----- for/each loop
//    for (double expense: expenses) {
//        if (expense > mostExpensive){
//            mostExpensive = expense;
//        }
//
//    }

    //Removing elements during traversal

    //Removing An Element Using while do not need the counter for the "while" loop
//    int i = 0; // initialize counter
//
//while (i < lst.size()) {
//        // if value is odd, remove value
//        if (lst.get(i) % 2 != 0){
//            lst.remove(i);
//        } else {
//            // if value is even, increment counter
//            i++;
//        }
//    }

    //Removing An Element Using for
    //When using a for loop, we, unfortunately, must increase our loop control variable —
    // the loop control variable will always change when we reach the end of the loop
    // (and it will usually change by 1 because we often use something like i++.)
    // Since we can’t avoid increasing our loop control variable,
    // we can take matters into our own hands and decrease the loop control
    // variable whenever we remove an item.

//    for (int i = 0; i < lst.size(); i++) { <----- for loop
//        if (lst.get(i) == "value to remove"){
//            // remove value from ArrayList
//            lst.remove(lst.get(i)); <------- Remove the value
//            // Decrease loop control variable by 1
//            i--;   <---- decrease you loop control
//        }
//    }

    // Add your code below
//
//    for (int i = 0; i < lunchBox.size(); i++) {
//        if (lunchBox.get(i) == "ant"){
//            lunchBox.remove(lunchBox.get(i));
//            i--;
//        }
//    }

    // REVIEW
//    while loops: These are useful to repeat a code block an unknown
//    number of times until some condition is met. For example:

//    int wishes = 0;
//
//while (wishes < 3) {
//
//        // code that will run
//        wishes++;
//
//    }
//
//    for loops: These are ideal for when you are incrementing
//    or decrementing with a counter variable. For example:

//    for (int i = 0; i < 5; i++) {
//
//        // code that will run
//
//    }

//    For-each loops: These make it simple to do something with each item in a list.
//    For example:
//    for (String inventoryItem : inventoryItems) {
//
//        // do something with each inventoryItem
//
//    }

    //MORE EXAMPLES
//    // for/each loop
//    for (String llama : llamas) {
//
//        sayHello(llama);
//
//    }


}
