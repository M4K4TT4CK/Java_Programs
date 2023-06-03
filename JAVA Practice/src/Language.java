//Parent class for language package
public class Language {
    //
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    //constructor
    public Language(String langName, int speakers, String regions, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    //Pubic method
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The " + this.name + " language follows the word order: "+this.wordOrder);
    }

    //Main method
    public static void main(String[] args){
        //welcome message
        System.out.println("Hello!");
        System.out.println("");
        System.out.println("Welcome to the Language Famillies application.");
        System.out.println("");
        //instantiate new language
        Mayan kiche = new Mayan("Ki'che'", 12345);
        SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 23423423);
        SinoTibetan nonChinese = new SinoTibetan("Burmese", 234134);
        Spanish spain = new Spanish("Spanish", 23423434);
        //call new language variables
        kiche.getInfo();
        chinese.getInfo();
        nonChinese.getInfo();
        spain.getInfo();

    }
}