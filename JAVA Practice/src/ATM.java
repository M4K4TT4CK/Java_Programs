public class ATM{
    /*
    Just some basic functions for static variables and methods
     */
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    // adding money to atm and count total ATMs in series
    public ATM(int inputMoney){
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }
    // withdrawl of money
    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }
    // Average money accross ATMS
    public static void averageMoney(){
        System.out.println(totalMoney / numATMs);
    }

    public static void main(String[] args){

        System.out.println("Total number of ATMs: " + ATM.numATMs);
        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(500);
        ATM thridATM = new ATM(100003);
        ATM fourthATM = new ATM(100003);
        ATM fifthATM = new ATM(100003);
        ATM sixthATM = new ATM(100003);
        ATM seventhATM = new ATM(100003);
        System.out.println("Total number of ATMs: " + ATM.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);

        // Call averageMoney() here
        ATM.averageMoney();
    }

}