//additional shild class
class Spanish extends Language{

    Spanish(String languageName, int speakers){
        super(languageName, speakers, "Central America", "subject-verb-object");
    }

    @Override
    public void getInfo() {

        System.out.println("The Language spanish is " + this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The " + this.name + " language follows the word order: " + this.wordOrder);
    }
}