public class PhoneticAlphabet {

    public static void main(String[] args) {

        getAlpha('Z');

    }

    public static char getAlpha(char alpha){

        switch (alpha){
            case 'A':
                System.out.println("Alpha");
                break;
            case 'B':
                System.out.println("Bravo");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Delta");
                break;
            case 'E':
                System.out.println("Echo");
                break;
            default:
                System.out.println("Letter character " + alpha + " not found!");

        }
        return alpha;
    }
}
