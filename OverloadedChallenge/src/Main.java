public class Main {
/* this program converts inches to centimeters two ways
1 - By converting inches to cm
2. converting feet and inches to cm
 */
    public static void main(String[] args) {
        System.out.println("Conversion for height in CM to Feet");
        System.out.println("68 inches is " + convertToCentimeters(68) + " cm!");
        System.out.println("5 ft 8 in is " + convertToInches(5, 8) + " cm!");

    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToInches(int feet, int inches){
        // 1st way to do it
//        return convertToCentimeters((feet * 12) + inches);
        // 2nd way to do it
//        int feetToInches = feet * 12;
//        double inchConvert = ((feetToInches + inches) * 2.54);
//        return inchConvert;
        //3rd way to do it
        int feetToInches = feet * 12;
        int inchConvert = feetToInches + inches;
        double result = convertToCentimeters(inchConvert);
        return result;
    }
}

