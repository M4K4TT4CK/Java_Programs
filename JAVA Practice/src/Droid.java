public class Droid {
    //instance field
    int batteryLevel;
    String name;
    //constructor class
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }
    //performTask
    public void performTask(String task){
        batteryLevel = batteryLevel - 10;
        System.out.println(name + " is performing a task: " + task + " and has " + batteryLevel + " remaining.");
    }
    //to method
    public String toString(){
        return "Hello, I'm the droid: " + name;
    }
    //energy output can use, but also added to the performTask function, it seems to be cleaner than the
    //extra print lines
//    public void energyReport(){
//        System.out.println(name + " has " + batteryLevel + " percent left.");
//    }
    //main method
    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        //print name
        System.out.println(codey);
        //tasks
//        codey.performTask("fighting");
//        codey.performTask("dancing");
//        codey.performTask("shooting");
//        codey.performTask("driving");
//        codey.performTask("coding");
        codey.performTask("is dying");
//        codey.energyReport();

    }
}