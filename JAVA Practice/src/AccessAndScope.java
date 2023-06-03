//public class AccessAndScope {
    // ACCESS AND SCOPE practice
    // WHAT IS IT?

    //As our Java programs begin to get bigger and we begin to have
    // multiple Objects and Classes that interact with each other,
    // the concepts of access and scope come into play.

//          Access
//The public and private keywords and how they relate to Classes, variables, constructors, and methods
//The concept of encapsulation
//Accessor methods, sometimes known as “getters”
//Mutator methods, sometimes known as “setters”

//          Scope
//Local variables vs. instance variables
//The this keyword

    // The public keyword

//We can define the access of many different parts of our code
// including instance variables, methods, constructors, and even a class itself.
// If we choose to declare these as public this means that any part of our code can interact with them
// - even if that code is in a different class!

//    While you can set them to private, it’s fairly uncommon to do so.
//    Instead, we’ll focus on why you might make your instance variables and methods private.

//public class Bank{
//    private CheckingAccount accountOne;
//    private CheckingAccount accountTwo;
//
//    public Bank(){
//        accountOne = new CheckingAccount("Zeus", 100, "1");
//        accountTwo = new CheckingAccount("Hades", 200, "2");
//    }
//
//    public static void main(String[] args){
//        Bank bankOfGods = new Bank();
//        System.out.println(bankOfGods.accountOne.name);
//        bankOfGods.accountOne.addFunds(5);
//        bankOfGods.accountOne.getInfo();
//
//    }
//
//}

    //          The private keyword and encapsulation
//    When a Class’ instance variable or method is marked as private,
//    that means that you can only access those structures from elsewhere
//    inside that same class. Let’s look back at our DogSchool example:

//    public class DogSchool{
//
//        public void makeADog(){
//            Dog cujo = new Dog("Cujo", 7);
//            System.out.println(cujo.age);
//            cujo.speak();
//        }
//    }

//    While those are valid points, sometimes restricting our code is actually useful from a design perspective.
//    This is one of the core ideas behind encapsulation.
// By making our instance variables (and some methods) private,
// we encapsulate our code into nice little bundles of logic.

    // Accessor and mutator methods

    //When writing classes, we often make all of our instance variables private.
    // However, we still might want some other classes to have access to them,
    // we just don’t want those classes to know the exact variable name.
    // To give other classes access to a private instance variable,
    // we would write an accessor method (sometimes also known as a “getter” method).

    //public class Dog{
    //  private String name;
    //
    //  //Other methods and constructors
    //
    //  public String getName() {
    //    return name;
    //  }
    //}
    //. Accessor methods will always be public,
    // and will have a return type that matches the
    // type of the instance variable they’re accessing.
    //Similarly, private instance variables often have mutator methods (sometimes known as “setters”).
    // These methods allow other classes to reset the value stored in private instance variables.

    //      Scope: Local Variables
    //In addition to access modifiers like public and private,
    // the scope of the variable also determines what parts of y
    // our code can access that variable.
//    public class ScopeExample{
//        public static void main(String[] args){
//
//            int[] myArray = {1, 2, 3, 4};
//            int sum = 0; <--- the example moved this from inside the "for" loop to get it to function
//            for(int i = 0; i < myArray.length; i++){
//                sum += myArray[i]; <--- int sum =0; was located her prior to mvoing it
//            }
//
//            System.out.println(sum);
//        }
//    }

    // The "this" Keyword
// Often times when creating classes, programmers will create local
// variables with the same name as instance variables. For example, consider the code block below:

    //If we wanted to access the instance variable and not the local variable,
    // we could use the this. keyword.
//    public class Dog{
//        public String name; <--- instance variable
//
//        public Dog(String inputName){
//            name = inputName;
//        }
//
//        public void speakNewName(String name){
//            System.out.println("Hello, my new name is" + this.name); <----- use this. to reference instance variable
//        }                                                                     instead of the local variable

    //Oftentimes, you’ll see constructors have parameters with the same name as the instance variable.
    // For example, you might see something like:
    //
    //public Dog(String name){
    //  this.name = name;
    //}
//      You can read this as “set this Dog‘s instance variable name equal to the variable
//      passed into the constructor”.
// EXAMPLE <----- I dont like this method. i wish i could just save them all as instance fields
//
//    public class SavingsAccount{
//
//        public String owner;
//        public int balanceDollar;
//        public double balanceEuro;
//
//        public SavingsAccount(String owner, int balanceDollar){
//            // Complete the constructor
//            this.owner = owner;
//            this.balanceDollar = balanceDollar;
//            this.balanceEuro = balanceDollar * 0.85;
//        }
//
//        public void addMoney(int balanceDollar){
//            // Complete this method
//            System.out.println("Adding " + balanceDollar + " dollars to the account.");
//            this.balanceDollar += balanceDollar;
//            System.out.println("The new balance is " + this.balanceDollar + " dollars.");
//        }
//
//        public static void main(String[] args){
//            SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
//
//
//            // Make a call to addMoney() to test your method
//            zeusSavingsAccount.addMoney(2000);
//        }
//
//    }

    // USING this with METHODS

    //We’ve seen how the this works with variables, but we can also use the this with methods.

    // EXAMPLE OF USING this WITH METHODS

//    public void hasBirthday(){
//        //Complete this method
//        this.setAge(this.age + 1);
//        this.setWisdom(this.wisdom + 5);
//        this.setFitness(this.fitness - 3);
//    }
//
//    public static void main(String[] args){
//        Person emily = new Person(20);
//        emily.hasBirthday();
//        System.out.println("New age is: " + emily.age);
//        System.out.println("New wisdom is: " + emily.wisdom);
//        System.out.println("New fitness is: " + emily.fitness);
//    }
//}

    //      other Private Methods
    //s. Oftentimes, private methods are helper methods —
    // that is to say that they’re methods that other, bigger methods use.
    // private helper method

    // Write the calculateNextMonthInterest() here
//    private double calculateNextMonthInterest(){
//        return this.balance * this.interestRate;

    // example of not beign able to use private helper method

//    public static void main(String[] args){
//        Bank bankOfGods = new Bank();
//        bankOfGods.accountOne.getAccountInformation();
//        bankOfGods.accountOne.calculateNextMonthInterest(); <-----this was a private helper method and returnred an  error
//    }

//              REVIEW


///


//    Static methods of the Math class
//Learn how to use static methods from the Math class to implement numerical calculations in Java.

//The Java Math class is part of the java.lang package;
// it contains a variety of methods that can be used to perform numerical calculations in our programs

// Calling Static Methods
// Every method in the Math class is static.

// EXAMPLE of using math class with min and mx

//public class Numbers {
//  public static void main(String[] args) {
//    // Call method using the Class name, the dot operator, the method name, and arguments
//    int smallerNumber = Math.min(3, 10);
//    System.out.println(smallerNumber); // Prints: 3
//  }
//}

/// must import math class
// import static java.lang.Math.*; <---- must add this to the top of the program


// USEFULL ALORITHMS FOR LATER
//class RandomNumbers {
//    public static void main(String[] args) {
//        // Random double value between 0 and 1
//        System.out.println(Math.random());
//
//        // Random double value between 0 and 9
//        double a = Math.random() * 10;
//        System.out.println(a);
//
//        // Random int value between 0 and 9
//        int b = (int)(Math.random() * 10);
//        System.out.println(b);
//
//        // Random int value between 1 and 10
//        int c = (int)(Math.random() * 10) + 1;
//        System.out.println(c);
//
//        // Random int value between 10 and 20
//        int d = (int)(Math.random() * 11 ) + 10;
//        System.out.println(d);
//    }
//}
//          STATIC VARIABLES AND METHODS
//          We’ll begin writing our own static methods soon,
//          but before we do, let’s take a look at static variables.
//          Much like static methods, you can think of static variables as
//          belonging to the class itself instead of belonging to a particular object of the class.
//public class Dog{
//
//    // Static variables
//    public static String genus = "Canis";
//
//    //Instance variables
//    public int age;
//    public String name;
//
//    public Dog(int inputAge, String inputName){
//        this.age = inputAge;
//        this.name = inputName;
//    }
//
//    public class ATM{
//
//        // Step 2: Create your static variables here
//        public static int totalMoney = 0;
//        public static int numATMs = 0;
//        // Instance variables
//        public int money;
//
//        public ATM(int inputMoney){
//            this.money = inputMoney;
//        }
//
//        public void withdrawMoney(int amountToWithdraw){
//            if(amountToWithdraw <= this.money){
//                this.money -= amountToWithdraw;
//            }
//        }
//
//        public static void main(String[] args){
//            // Step 1: Create your two ATMs here
//            ATM firstATM = new ATM(1000);
//            ATM secondATM = new ATM(500);
//            System.out.println(firstATM.money);
//            System.out.println(secondATM.money);
//
//
//            // Step 3: Print your static variable in three different ways here
//            System.out.println(ATM.totalMoney);
//            System.out.println(firstATM.totalMoney);
//            System.out.println(secondATM.totalMoney);
//        }
//    }
//          MODIFYING STATIC VARIABLES

//    public static int totalMoney = 0;
//    public static int numATMs = 0;
//
//    // Instance variables
//    public int money;
//
//    public ATM(int inputMoney){
//        this.money = inputMoney;
//
//        // Steps 1 and 2: Edit numATMs and total money here
//        numATMs += 1;
//        totalMoney += inputMoney;
//    }

//          Writing your own static methods
// Write your averageMoney() method here
//public static void averageMoney(){
//    System.out.println(totalMoney / numATMs);
//}

//           REVIEW



//}
