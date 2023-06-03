public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello, Mike!");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien.");
        }

        boolean isCar = false;
        if(!isCar) {
            System.out.println("Thats not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volskwagen" ? false : true;

        if(isDomestic){
            System.out.println("This car is domestic to our country!");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double num1 = 20.00;
        double num2 = 80.00;
        double result = (num1 + num2) * 100;
        System.out.println("My result is :" + result);
        double newResult = result % 40.00;
        System.out.println("The remainder is: " + newResult);
        boolean rest = (newResult == 0.00) ? true : false;
        System.out.println("isNoRemainder = " + rest);

        if(!rest){
            System.out.println("got some remainder");
        }


    }
}
