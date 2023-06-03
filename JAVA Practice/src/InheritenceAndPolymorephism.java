public class InheritenceAndPolymorephism {
    //Inheritence
    /*
    The object-oriented principle of inheritance saves us the headache of
    redefining the same class members all over again
     */
    /*
    There are several terms you’ll encounter frequently:

    Parent class, superclass, and base class refer to the class that another class inherits from (like Shape).
    Child class, subclass, and derived class refer to a class that inherits from another class (like Triangle).
     */
    // Inheritence in Practice
    // So how do we define a child class so that it inherits from a parent class?
    // We use the keyword extends like this
    // EXAMPLE
//    class Shape {
//
//        // Shape class members
//
//    }
//
//    class Triangle extends Shape {
//
//        // additional Triangle class members
//
//    }
//    When we use inheritance to extend a subclass from a superclass,
//    we create an “is-a” relationship from the subclass to the superclass.
//    For example, an object of Triangle is a member of the Shape class; however,
//    an object of Shape is not necessarily an object of Triangle.

    // EXAMPLE superclass to subclass/// superclass is Noodle-----> Spaghetti in subclass
//    public static void main(String[] args) {
//        Spaghetti spaghettiPomodoro = new Spaghetti();
//        System.out.println(spaghettiPomodoro.texture);
//
//    }
//
//}
    // INHERITING THE CONSTRUCTOR
    //Let’s take a look at how the super() constructor works!
    //class Triangle extends Shape {
    //
    //  Triangle() {
    //    super(3);
    //  }
    //
    //  // additional Triangle class members
    //
    //}

    //using the super() method which acts like the parent constructor inside the child class constructor:
    //It is also possible to write a constructor without making a call to any super() constructor:
    // EXAMPLE ;
//    class Triangle extends Shape {
//
//        Triangle() {
//            this.numSides = 3;
//        }
//
//        // additional Triangle class methods
//
//    }

    // EXAMPLE of super
    // Noodle.java <--- superclass

//    public static void main(String[] args) {
//        Pho phoChay = new Pho();
//        System.out.println(phoChay.shape);
//    }
//
//}

    // Pho.java <---- subclass
//    class Pho extends Noodle {
//        Pho() {
//            super(30.0, 0.64, "flat", "rice four"); <--- adjusted: lengthInCentimeters, widthInCentimeters, shape, ingredients
//        }
//    }
//      PARENT CLASS ASPECT MODIFIERS
    /*
    You may recall that Java class members use private and public access modifiers
    to determine whether they can be accessed from outside the class.
    So does a child class inherit its parent’s private members?

    Well, no. But there is another access modifier we can use to keep a
    parent class member accessible to its child classes and to files in the package
    it’s contained in — and otherwise private: protected
     */
    // EXAMPLE OF PROTECTED BEING USED
//    class Shape {
//
//        protected double perimeter;
//
//    }
// any child class of Shape can access perimeter

    /*
     If we add final after a parent class method’s access modifier,
     we disallow any child classes from changing that method.
     This is helpful in limiting bugs that might occur from modifying a particular method.
     */
    // protcted the class from any subclass <----cannot be modified by any subclass (child class)
    //  public final boolean isTasty() {
    //
    //    return true;

    // INTRODUCING POLYMORPHISM
//    String makeJuice(Fruit fruit) {
//
//        return "Apple juice and " + fruit.squeeze();
//
//    }
//
//    // inside main()
//    Orange orange = new Orange();
//    System.out.println(juicer.makeJuice(orange));
    /*
    This is because Java incorporates the object-oriented programming principle of polymorphism.
    Polymorphism, which derives from Greek meaning “many forms”, allows a child class to share the
    information and behavior of its parent class while also incorporating its own functionality.
     */
//    The main advantages of polymorphic programming:
//
//    Simplifying syntax
//    Reducing cognitive overload for developers

    // METHOD OVERRIDING
    //Notice that in order to properly override printBalance(),
    // in CheckingAccount the method has the following in common with the
    // corresponding method in BankAccount:
    //
    //Method name
    //Return type
    //Number and type of parameters

    /*
    You may have also noticed the @Override keyword above printBalance() in CheckingAccount.
    This annotation informs the compiler that we want to override a method in the parent class.
    If the method doesn't exist in the parent class, we’ll get a helpful error when we compile the program.
     */
    // EXAMPLE OF OVERRIDE FOR COOKING SETTINGS IN APPLICATION
    /*
      // Add the new cook() method below:
  @Override
   public void cook() {

    System.out.println("Grinding or scraping dough.");

    this.texture = "cooked";

  }
     */
    //      USING A CHILD CLASS AS ITS PARENT CLASS
    //n important facet of polymorphism is the ability
    // to use a child class object where an object of its parent class is expected.
    /*
      public static void main(String[] args) {

    Dinner noodlesDinner = new Dinner();
    // Add your code here:
    Noodle biangBiang = new BiangBiang(); <-----Biangbiang is from the child class//object from BiangBiang.java
    noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");


  }
     */

    // Child classes in arrays and ArrayLists
    /*
    Usually, when we create an array or an ArrayList,
    the list items all need to be the same type.
    But polymorphism puts a new spin on what is considered the same type…
     */

    // CHILD CLASS IN METHOD PARAMETERS
    /*
    If we use a superclass reference as a method parameter,
    we can call the method using subclass reference arguments!
     */

}
