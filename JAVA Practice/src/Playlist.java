import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
// empty Arraylist
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        // add songs
        desertIslandPlaylist.add("Song one");
        desertIslandPlaylist.add("Song two");
        desertIslandPlaylist.add("Song three");
        desertIslandPlaylist.add("Song four");
        desertIslandPlaylist.add("Song five");
        desertIslandPlaylist.add("Song six");
        desertIslandPlaylist.add("Song seven");
        //print current arraylist
        System.out.println(desertIslandPlaylist);
        // check current size of list
        System.out.println(desertIslandPlaylist.size());
        // removed from songs//capped at five
        desertIslandPlaylist.remove("Song six");
        desertIslandPlaylist.remove("Song seven");
        // updates size count
        System.out.println(desertIslandPlaylist.size());
        // updated arraylist
        System.out.println(desertIslandPlaylist);
        // pull indicies of swapped songs and assign
        //to variables a and b
        int indexA = desertIslandPlaylist.indexOf("Song one");
        int indexB = desertIslandPlaylist.indexOf("Song two");
        // new string variable
        String tempA = "Song one";
        String tempB = "Song two";
        //set new songs at indicies
        desertIslandPlaylist.set(indexA, "Song two");
        desertIslandPlaylist.set(indexB, "Song one");
        //print to see fucntion
        System.out.println(desertIslandPlaylist);
    }

}