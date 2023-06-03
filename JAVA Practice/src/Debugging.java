public class Debugging {
    /*
    In Java, there are many different ways of classifying errors, but they can be boiled down to three categories:

    Syntax errors: Errors found by the compiler.
    Run-time errors: Errors that occur when the program is running.
    Logic errors: Errors found by the programmer looking for the causes of erroneous results.
     */
    //SYNTAX ERRORS

    /*
    Syntax errors represent grammar errors in the use of the programming language.
     They are the easiest to find and correct. The compiler will tell you where it
     got into trouble, and its best guess as to what you did wrong.
     */

    // RUN-TIME ERRORS
    /*
    If our program has no compile-time errors, it’ll run. This is where the fun really starts.

    Errors which happen during program execution (run-time) after successful compilation are called
    run-time errors. Run-time errors occur when a program with no compile-time errors asks the computer
    to do something that the computer is unable to reliably do.
     */

    // EXCEPTION ERRORS
    /*
    Java uses exceptions to handle errors and other exceptional events.
    Exceptions are the conditions that occur at runtime and may cause the termination of the program.
     */

    /*
    Some common exceptions that you will see in the wild:

ArithmeticException: Something went wrong during an arithmetic operation; for example, division by zero.
NullPointerException: You tried to access an instance variable or invoke a method on an object that is currently null.
ArrayIndexOutOfBoundsException: The index you are using is either negative or greater than the last index of the array (i.e., array.length-1).
FileNotFoundException: Java didn’t find the file it was looking for.
     */

    /*
    Exception Handling
Exception handling is an essential feature of Java programming that allows us to use run-time error exceptions to make our debugging process a little easier.

One way to handle exceptions is using the try/catch:

The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed if an error occurs in the try block.

The try and catch keywords come in pairs, though you can also catch several types of exceptions in a single block:
     */

    // EXAMPLE EXCEPTIONN HANDLING
//    try {
//
//        //  Block of code to try
//
//    } catch (NullPointerException e) {
//
//        // Print the error message like this:
//        System.err.println("NullPointerException: " + e.getMessage());
//
//        // Or handle the error another way here
//
//    }
    // try and catch example
//    public class Debug {
//
//        public static void main(String[] args) {
//
//            int width = 0;
//            int length = 40;
//
//            int ratio = length / width;
//
//            try {
//                int redOne = 1232.123;
//                String blue = "Red";
//                return redOne * blue;
//            } catch (ArithmeticException e) {
//
//                System.err.println("Arithmatic Exception: " + e.getMEssage());
//            }
//
//        }
//
//    }

    // LOGIC ERROS
    /*
    Logic errors occur when there is a design flaw in your program.
    These are some of the most common errors that happen to beginners and also usually
    the most difficult to find and eliminate.
     */

    //Some common logic errors:
    //
    //Program logic is flawed
    //Some “silly” mistake in an if statement or a for/while loop

    // DEBUGGING TECHNIQUES
    /*
    Debugging Techniques
If you have examined the code thoroughly, and you are sure the compiler is compiling
the right source file, it is time for desperate measures:

1. Divide and conquer: Comment out or temporarily delete half the code to isolate an issue.

If the program compiles now, you know the error is in the code you deleted.
Bring back about half of what you removed and repeat.
If the program still doesn’t compile, the error must be in the code that remains.
Delete about half of the remaining code and repeat.
Tip: In most code editors, one can highlight a block of code and use the keyboard
shortcut command + / to comment it out.

2. Print statements for the rescue: Use System.out.println() to check variable/return values
at various points throughout the program.

A lot of the time with logic errors, there was a flawed piece of logic, a miscalculation,
a missing step, etc. By printing out the values at different stages of the execution flow,
you can then hopefully pinpoint where you made a mistake.
     */



}
