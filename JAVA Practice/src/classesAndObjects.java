public class classesAndObjects {
    public static void main(String[] args) {
        /*

        //Example of a class build
        public class Car {
// scope of Car class starts after curly brace

  public static void main(String[] args) {
    // scope of main() starts after curly brace

    // program tasks

  }
  // scope of main() ends after curly brace

}
// scope of Car class ends after curly brace
         */

        //Classes: Constructors
        //In order to create an object (an instance of a class),
        // we need a constructor method. The constructor is defined within the class.
        /*
        public class Car {
        // Constructor method
        public Car() {
        // instructions for creating a Car instance
  }

        public static void main(String[] args) {
        // body of main method
  }
}
         */

        //INSTANCE FIELDS
        //We’ll add data to an object by introducing instance variables, or instance fields.
        //Another way to think of this is that instance variables are the nouns and adjectives
        // associated with an object. What qualities other than color might a car have?
        /*

        public class Store {
        // declare instance fields here!
        String productType;

         */

        //CONSTRUCTOR PARAMETERS
//        public class Store {
//            // instance fields
//            String productType;
//
//            // constructor method
//            public Store(String product) {
//                productType = product;
//            }
//
//            // main method
//            public static void main(String[] args) {
//                Store lemonadeStand = new Store("lemonade");
//                System.out.println(lemonadeStand.productType);
//
//            }
//        }
        //MULTIPLE FIELDS
//
//        public class Store {
//            // instance fields
//            String productType;
//            int inventoryCount;
//            double inventoryPrice;
//            // constructor method
//            public Store(String product, int count, double price) {
//                productType = product;
//                inventoryCount = count;
//                inventoryPrice = price;
//
//            }
//
//            // main method
//            public static void main(String[] args) {
//                Store cookieShop = new Store("cookies", 12, 3.75);
//
//            }
//        }
        //CLASSES: Review
        //DEFINEING METHODS
//        public class Store {
//            // instance fields
//            String productType;
//
//            // constructor method
//            public Store(String product) {
//                productType = product;
//            }
//
//            // advertise method
//            public void advertise() {
//                System.out.println("Come spend some money!");
//                System.out.println("Selling " + productType + "!");
//
//            }
//
//            // main method
//            public static void main(String[] args) {
//
//            }
//        }

        //CALLING METHODS
//        public class Store {
//            // instance fields
//            String productType;
//
//            // constructor method
//            public Store(String product) {
//                productType = product;
//            }
//
//            // advertise method
//            public void advertise() {
//                System.out.println("Selling " + productType + "!");
//                System.out.println("Come spend some money!");
//            }
//
//            // main method
//            public static void main(String[] args) {
//                Store lemonadeStand = new Store("Lemonade");
//                lemonadeStand.advertise();
//                lemonadeStand.advertise();
//                lemonadeStand.advertise();
//            }
//        }
        //ADDING PARAMETERS
//        public class Store {
//            // instance fields
//            String productType;
//
//            // constructor method
//            public Store(String product) {
//                productType = product;
//            }
//
//            // advertise method
//            public void advertise() {
//                String message = "Selling " + productType + "!";
//                System.out.println(message);
//            }
//            public void greetCustomer(String customer) {
//                System.out.println("Welcome to the store, " + customer + "!");
//
//            }
//
//            // main method
//            public static void main(String[] args) {
//                Store lemonadeStand = new Store("Lemonade");
//                lemonadeStand.greetCustomer("Mike");
//            }
//        }

        //Reassigning instance fields
        /*
        public class Store {
  // instance fields
  String productType;
  double price;

  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;

  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.5);
    //print out new price
    System.out.println(lemonadeStand.price);

  }
}
         */
// RETURNS

        /*
        Remember, variables can only exist in the scope that they were declared in.
        We can use a value outside of the method it was created in if we return it from the method.
         */

        /*
          // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;

  }
         */
        /*
          // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();

    System.out.println(lemonadePrice);
         */
        //The toString() method
        //When we define a toString() method for a class,
        // we can return a String that will print when we print the object:
        //
        //  // toString()
        //    public String toString(){
        //    return "This store sells " + productType + " at a price of " + price + ".";
        //  }
    }
}
