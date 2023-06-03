public class MathMagic {
    public static void main(String[] args) {
        //the original number
        int myNumber = 21343;
        //step to math magic
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        //output should always be three, unless the # is too large
        System.out.println(stepSix);
//
//        //the original number
//        int myNumber = 21343;
//        //magic number
//        int magicNumber = myNumber * myNumber;
//        //steps
//        magicNumber += myNumber;
//        magicNumber /= myNumber;
//        magicNumber += 17;
//        magicNumber -= myNumber;
//        magicNumber /= 6;
//        System.out.println(magicNumber);

    }
}
