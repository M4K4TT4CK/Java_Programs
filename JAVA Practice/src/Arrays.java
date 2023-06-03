//public class Arrays {
    //this is the introduction to arrays
//    That is a lot of ungainly repeated code. What if we had a hundred lottery numbers?
//    It is more clean and convenient to use a Java array to store the data as a list.

    // Arrays are immutable whereas arraylist are mutable

    //Creating an Array Explicitly

    //double[] prices;  <---- creation of list
    //double[] prices = {13.15, 15.87, 14.22, 16.66}; <--- in am array (list

    // Create getTopics() below:
//    public String[] getTopics(){
//        String[] topics = {"Opinion", "Tech", "Science", "Health"};
//        return topics;
//    }

    // Importing arrays

//    When we printed out the array we created in the last exercise,
//    we saw a memory address that did not help us understand what was contained in the array.
//    If we want to have a more descriptive printout of the array itself, we need a toString() method
//    that is provided by the Arrays package in Java.

    //// import the Arrays package here:
    //import java.util.Arrays;
//
//    public static void main(String[] args){
//        Newsfeed sampleFeed = new Newsfeed();
//        String[] topics = sampleFeed.getTopics();
//        System.out.println(topics);
//        System.out.println(Arrays.toString(topics)); <---- printing out the list instead of the memory
//    }

    // GET ELEMENT BY INDEX (indicies)

    //  public String getTopTopic(){
    //    return topics[0];

    //  public void viewTopic(int topicIndex){
    //    views[topicIndex] = views[topicIndex] + 1;


    // CREATING AN EMPTY ARRAY

//    Empty arrays have to be initialized with a fixed size:

    //String[] menuItems = new String[5];
    //After declaring and initializing, we can set each index of the array to be a different item:
//    menuItems[0] = "Veggie hot dog";
//    menuItems[1] = "Potato salad";
//    menuItems[2] = "Cornbread";
//    menuItems[3] = "Roasted broccoli";
//    menuItems[4] = "Coffee ice cream";

    // or a group of commands also works
//    String[] menuItems = {"Veggie hot dog", "Potato salad", "Cornbread", "Roasted broccoli", "Coffee ice cream"};

//    We can also change an item after it has been assigned!
//    Let’s say this restaurant is changing its broccoli dish to a cauliflower one:

    //menuItems[3] = "Baked cauliflower";

//    public Newsfeed(){
//        // Initialize favoriteArticles here:
//        favoriteArticles = new String[10];
//    }

//    public void setFavoriteArticle(int favoriteIndex, String newArticle){
//        // Add newArticle to favoriteArticles:
//        favoriteArticles[favoriteIndex] = newArticle;

    // Length
    //What if we have an array storing all the usernames for our program,
    // and we want to quickly see how many users we have?To get the length of an array,
    // we can access the length field of the array object:

    //String[] menuItems = new String[5];
    //System.out.println(menuItems.length);

    //This command would print 5, since the menuItems array has 5 slots,
    // even though they are all empty

    //  public int getNumTopics(){
    //      return topics.length;

    // String[] args

    //When we write main() methods for our programs, we use the parameter String[] args.
    // Now that we know about array syntax, we can start to parse what this means

    //A String[] is an array made up of Strings. Examples of String arrays:
    //String[] humans = {"Talesha", "Gareth", "Cassie", "Alex"};
    //String[] robots = {"R2D2", "Marvin", "Bender", "Ava"};

    //The args parameter is another example of a String array.
    // In this case, the array args contains the arguments that we pass in from the terminal
    // when we run the class file. (So far, args has been empty.)

    //So how can you pass arguments to main()? Let’s say we have this class HelloYou:
//    public class HelloYou {
//        public static void main(String[] args) {
//            System.out.println("Hello " + args[0]);
//        }
//    }
//    if(args[0].equals("Robot")){
//        //topics for a Robot feed:
//        String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
//        feed = new Newsfeed(robotTopics);
//    }
//    else if(args[0].equals("Human")){
//        //topics for a Human feed:
//        String[] humanTopics = {"Politics", "Science", "Sports", "Love"};


    // REVIEW OF ARRAYS

//    import java.util.Arrays;
//
//    public class Classroom {
//
//        public static void main(String[] args){
//            String[] students = {"Sade", "Alexus", "Sam", "Koma"};
//            double[] mathScores = new double[4];
//            mathScores[0] = 94.5;
//            mathScores[2] = 76.8;
//
//            System.out.println("The number of students in the class is " + students.length + ".");
//
//        }
//    }

    // ARRAY LISTS (Arraylists)

    //To create mutable and dynamic lists, we can use Java’s ArrayList class. ArrayList allows us to:
//    Store object references as elements
//    Store elements of the same type (just like arrays)
//    Access elements by index (just like arrays)
//    Add elements
//    Remove elements

    //import java.util.ArrayList; <---- must import ArrayList IOT use arraylists

    // Creating Arraylist
//    To create an ArrayList, we need to declare the type of objects it will hold, just as we do with arrays:
//
//    ArrayList<String> babyNames; <--- declared a string ArrayList
//    We use angle brackets < and > to declare the type of the ArrayList.
//    These symbols are used for generics. Generics are a Java construct that allows us to
//    define classes and objects as parameters of an ArrayList. For this reason,
//    we can’t use primitive types in an ArrayList:
//    Need to use:
    //<Integer>
    //<String>
    //<Double>
    //<Character>
//
//    // Declaring:
//    ArrayList<Integer> ages;
//// Initializing:
//    ages = new ArrayList<Integer>();
//
//    // Declaring and initializing in one line:
//    ArrayList<String> babyNames = new ArrayList<String>();

    // EXAMPLE OF CREATING ArrayList

    // Double line
//    ArrayList<String> toDoList;
//    toDoList = new ArrayList<String>();

    // // Create single line toDoList below:
    // ArrayList<String> toDoList = new ArrayList<String>();

    // ADDING AN ITEM

//    ArrayList comes with an add() method which inserts an element into the structure.
//    There are two ways we can use add().

    // To add new things to the list at the end of an ArrayList
//    ArrayList<Car> carShow = new ArrayList<Car>();
//
//carShow.add(ferrari);
//// carShow now holds [ferrari]
//carShow.add(thunderbird);
//// carShow now holds [ferrari, thunderbird]
//carShow.add(volkswagen);
//// carShow now holds [ferrari, thunderbird, volkswagen]

    // Adding an element a specific index in an ArrayList

    // Insert object corvette at index 1
//carShow.add(1, corvette);
//// carShow now holds [ferrari, corvette, thunderbird, volkswagen]
//
//// Insert object porsche at index 2
//carShow.add(2, porsche);
//// carShow now holds [ferrari, corvette, porsche, thunderbird, volkswagen]
//
//    public static void main(String[] args) {
//
//        ArrayList<String> toDoList = new ArrayList<String>();
//        String toDo1 = "Water plants";
//        // Add more to-dos here:
//        String toDo2 = "Do Laundry";
//        String toDo3 = "Wash the dishes";
//        // Add to-dos to toDoList
//        toDoList.add(toDo1);
//        toDoList.add(toDo2);
//        toDoList.add(toDo3);
//
//        System.out.println(toDoList);
//
//
//    }

    // ArrayList SIZE

    //Let’s say we have an ArrayList that stores items in a user’s online shopping cart.
    // As the user navigates through the site and adds items, their cart grows bigger and bigger.
    //
    //If we wanted to display the number of items in the cart,
    // we could find the size of it using the size() method:
    // .size() method it find the size of someones list in an ArrayList

    // Print the size of each ArrayList below:
//    System.out.println(sherlocksToDos.size()); <----- 5
//    System.out.println(poirotsToDos.size()); <------ 6

    // Accessing an index in ArrayLists

    //With arrays, we can use bracket notation to access a value at a particular index:
//  For ArrayList bracket notation will not work, must use .get() method to pull data at indicies

    //System.out.println(shoppingCart.get(2));
//
//     System.out.println("Sherlock's third to-do:");
//    // Print Sherlock's third to-do:
//    System.out.println(sherlocksToDos.get(2));
//
//    System.out.println("\nPoirot's second to-do:");
//    // Print Poirot's second to-do:
//    System.out.println(poirotsToDos.get(1));

// CHANGING A VALUE IN AN ArrayList

    //ArrayList has a slightly different way of doing this, using the set() method:
    //shoppingCart.set(0, "Tweed Cape"); <---- this easier than in python


    // REMOVED AN ITEM IN AN ArrayList
    // You can remove an item from a ArrayList using the .remove() method
    // Remove each to-do below:
//    sherlocksToDos.remove("visit the crime scene");
//    poirotsToDos.remove("visit the crime scene");
//    sherlocksToDos.remove("play violin");

    // GETTING AN ITEMS INDEX IN AN ArrayList
    // we use the .indexOf() method for that
    // System.out.println(detectives.indexOf("Fletcher"));

    // Change the value printed:
    //System.out.println(sherlocksToDos.indexOf("solve the case")); <---- 3 remaining cases

    // REVIEW OF ArrayList's
//    Creating an ArrayList.
//    Adding a new ArrayList item using add().
//    Accessing the size of an ArrayList using size().
//    Finding an item by index using get().
//    Changing the value of an ArrayList item using set().
//    Removing an item with a specific value using remove().
//    Retrieving the index of an item with a specific value using indexOf().


    // REVIEW SANDBOX
//
//    import java.util.ArrayList;
//
//    class List {
//
//        public static void main(String[] args) {
//
//            ArrayList<String> newList = new ArrayList<String>();
//// Add to ArrayList
//            newList.add("zero");
//            newList.add("one");
//            newList.add("two");
//            //.Print out length of ArrayList
//            System.out.println(newList.size());
//// Remove an item from Array List
//            newList.remove("two");
//// Print out length of ArrayList again
//            System.out.println(newList.size());
//// print current list
//            System.out.println(newList);
//            // set new item in list
//            newList.set(0, "not Zero");
//            // print new set in arraylist
//            System.out.println(newList);
//            // add a few more
//            newList.add("three");
//            newList.add("four");
//            newList.add("five");
//            //print size of array now
//            System.out.println(newList.size());
//            // add back missing one
//            newList.add(2, "two");
//            // print arraylist
//            System.out.println(newList);
//            //last count of list
//            System.out.println(newList.size());
//        }
//
//    }

////
//}
//}
