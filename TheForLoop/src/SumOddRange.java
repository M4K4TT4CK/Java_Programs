public class SumOddRange {

    public static void main(String[] args) {

//        for (int i : new int[]{-29, 2, 3, 5, 29, 1, 13, 15, 19, 11}) {
//            System.out.println(isOdd(i));
//        }

        //WORKS FOR MEMORY PULL//NOT USEFULL YET

//        for (int[] i : new int[][]{{1, 100}, {-1,100}, {100,100}, {13, 13}, {100, -1}, {100, 100}}){
//            System.out.println(i);
//        }
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -1));
        System.out.println(sumOdd(100, 1000));


    }
    public static boolean isOdd(int number) {

        if (number % 2 == 1){
            return true;
        } else if (number < 0) return false;
        return false;
    }

    public static int sumOdd(int start, int end){

        int sumsOdd = 0;

        if ((start >= 0) && (end >= 0) && (end >= start)){
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sumsOdd += i;
                }
            } return sumsOdd;
        } else return -1;
    }
}



