public class Calculator {
    //this is a basic calculator class
//add, subtract, multiply, divide, modulo
    //constructor
    public void calculator(){
    }
    //addition method
    public int add(int a, int b){
        return a + b;
    }
    //subtraction method
    public int subtract(int a, int b){
        return a - b;
    }
    //multiplication method
    public int multiply(int a, int b){
        return a * b;
    }
    //division method
    public int divide(int a, int b){
        return a / b;
    }
    //modulo method
    public int modulo(int a, int b){
        return a % b;
    }
    //main method
    public static void main(String[] args){
        //calculator object
        Calculator myCalculator = new Calculator();
        //add print
        System.out.println(myCalculator.add(5, 7));
        //subtract
        System.out.println(myCalculator.subtract(45, 11));
        //multiply test
        System.out.println(myCalculator.multiply(3, 6));
        //divide test
        System.out.println(myCalculator.divide(6, 2));
        //modulo test
        System.out.println(myCalculator.modulo(234, 324));
    }
}