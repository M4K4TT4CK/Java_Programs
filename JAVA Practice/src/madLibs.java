public class madLibs {
    /*
    This program generates a mad libbed story.
  Author: Mike
  Date: 2/5/2023
    */
    public static void main(String[] args){
        String name1 = "Mike";
        String adjective1 = "helpful";
        String adjective2 = "cheery";
        String adjective3 = "sad";
        String verb1 = "tiptoe";
        String noun1 = "dog";
        String noun2 = "cat";
        String noun3 = "beat";
        String noun4 = "foot";
        String noun5 = "car";
        String noun6 = "guitar";
        String name2 = "Emily";
        int number = 456;
        String place1 = "Jupiter";









        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
    }
}