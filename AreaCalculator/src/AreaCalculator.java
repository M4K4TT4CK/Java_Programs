public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(30));
        System.out.println(area(23, 32));

    }

    public static double area(double radius){

        if(radius < 0){
            return -1;
        }
        float result = (float) ((3.14159265359 * (radius * radius)));
        return result;
    }

    public static double area(double x, double y){

        if(x < 0 || y < 0){
            return -1;
        }
        float result1 = (float) (x *y);
        return result1;
    }
}
