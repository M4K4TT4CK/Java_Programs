public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            int megaByte = 1024;
            int remainingBytes = kiloBytes / megaByte;
            int bytes = kiloBytes % megaByte;
            System.out.println(kiloBytes + " KB = " + remainingBytes + " MB and " + bytes + " KB");
        }
    }
    public static void main(String[] args) {
        System.out.println("-----KB TO MB-----");
        System.out.println("");
        System.out.println("This program will convert Kilobytes to Megabytes.");
        System.out.println("");
        printMegaBytesAndKiloBytes(5000);

    }

}