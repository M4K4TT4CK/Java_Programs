public class StringMethods {

//    Introduction to String Methods
//    As you may recall, a String, which is widely used in Java,
//    is an object that represents a sequence of characters. It is a great way to store information.
//
//    Because character strings are so vital to programming,
//    Java dedicated an entire class to them. This is great news for us because the
//    String class has a lot of useful methods to help us perform operations on Strings
//    and data manipulation. We don’t have to import anything to use the String class
//    because it’s part of the java.lang package which is available by default.
//
//    In this lesson, we will go over several String methods:
//
//    length()
//    concat()
//    equals()
//    indexOf()
//    charAt()
//    substring()
//    toUpperCase() / toLowerCase()
}
// .length() method

// What's the character count?
//    System.out.println(tweet.length());


//      .concat() method

//    The concat() method concatenates one string to the end of another string.
//        Concatenation is the operation of joining two strings together.
//
//        Suppose we have a String called str1 and another String called str2,
//        using str1.concat(str2) would return str1 with str2 appended to the end of it.

//Code would be printed instead. The value of the String can’t change! Instead,
// we create a new object and need to assign that new object to some variable.

// What's the full name?
//    System.out.println(firstName.concat(lastName));

//      .equals method
//With objects, such as Strings, we can’t use the primitive equality operator == to check
// for equality between two strings. To test equality with strings, we use a built-in method called equals().

// EXAMPLE
//Side note, there’s also an equalsIgnoreCase() method that compares two strings without considering
//        upper/lower cases.

//    We can also compare String values lexicographically (think dictionary order) using the .compareTo() method

//    String password = "correcthorsebatterystaple";
//
//// Write the code:
//    System.out.println(password.equals("ijwenfiujw"));

//          .indexOf() method
// return the index where something is located
//If the indexOf() doesn’t find what it’s looking for, it’ll return a -1.
//String letters = "ABCDEFGHIJKLMN";
//
//System.out.println(letters.indexOf("EFG")); <------- Returns a 4 because thats where the check started
// EFG <----- 4,5,6 are the indicies

//public class MorseCode {
//
//    public static void main(String[] args) {
//
//        String code = ".... .. / .. .----. -- / ... --- -. -. -.-- /
//        .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";
//
//        // Write the code:
//        System.out.println(code.indexOf(". .- -"));
//
//
//    }
//
//}   <---- output was indexOf(87)

//              charAt() method
//The charAt() method returns the character located at a String‘s specified index.
// instead of returning an index, you place an indicies and then it returns a character
//String str = "qwer";
//
//System.out.println(str.charAt(2));
// will cause outofbounds error if proper index isn't used in the code

// EXAMPLE

//public class Initials {
//
//    public static void main(String[] args) {
//
//        // Add a first name and a last name:
//        String firstName = "Michael";
//        String lastName = "McMillin";
//
//        // What are the initials?
//        System.out.print(firstName.charAt(0));
//        System.out.print(lastName.charAt(0));
//        //used .print instead of .println
//        //to place on same line
//
//
//    }
//
//}

//          .subString() method
//There may be times when we only want a part of a string.
//        In such cases, we may want to extract a substring from a string.
//
//        The substring() method does exactly that. For example:
//String line = "The Heav'ns and all the Constellations rung";
//
//System.out.println(line.substring(24));

//    It would output Constellations rung because that’s what
//        begins at index 24 and ends at the end of line.
//        The substring begins with the character at the specified index
//        and extends to the end of the string.

// if we wanted to pull from the middle of a string we would specify
//String line = "The Heav'ns and all the Constellations rung";
//
//System.out.println(line.substring(27, 33));

// When we call with two arguments the first is call "inclusive" and the second is "exclusive"
//public class Poetry {
//
//    public static void main(String[] args) {
//
//        String line = "The Heav'ns and all the Constellations rung";
//        // Change the arguments:
//        System.out.println(line.substring(4, 11));
//
//    }
//
//}                         PRINTED OUT "Heav'ns"

//              toUpperCase() and toLowerCase() methods
//There will be times when we have a word in a case other than what we need it in.
// must create variable
// Luckily, Java has a couple String methods to help us out:
// EXAMPLE
//String input = "Cricket!";
//
//    String upper = input.toUpperCase();
//// stores "CRICKET!"
//
//    String lower = input.toLowerCase();
//// stores "cricket!"

//public class Hashtag {
//
//    public static void main(String[] args) {
//
//        String hashtag = "#100DaysOfCode";
//
//        // Make the hashtag lowercase:
//        System.out.println(hashtag.toLowerCase());
//
//
//    }
//
//}

//          REVIEW of StringMethods

//public class Review {
//
//    public static void main(String[] args) {
//
//        String name = "Mike";
//        String names = "McMi";
//        //get length
//        System.out.println(name.length());
//        // concat
//        System.out.println(name.concat(names));
//        // get the indexOf
//        System.out.println(name.indexOf("M"));
//        // pull character through index
//        System.out.println(names.charAt(0));
//        // does one equal the other
//        System.out.println(names.equals("ijwenrfiuwnf"));
//        // Substring oull
//        System.out.println(name.substring(1, 3));
//        // convert to uppercase
//        System.out.println(names.toUpperCase());
//        // convert to lowercase
//        System.out.println(name.toLowerCase());
//    }
//
//}