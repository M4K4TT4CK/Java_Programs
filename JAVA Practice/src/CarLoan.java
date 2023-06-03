public class CarLoan {
    //this class is designed to calculate a monthly car payment..
    // it can be applied to calculate a lot of different things

    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;
        System.out.println("This program will calculate total your monthly car payment!");
        System.out.println("___________________");
        System.out.println("");

        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        }
        else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        }
        else {
            int remainingBalance =  carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) /100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("The monthly cost is: $" + monthlyPayment);
        }



    }
}