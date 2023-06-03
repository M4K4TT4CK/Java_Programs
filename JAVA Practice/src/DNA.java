public class DNA {
    //determines whether protein is in a strand
    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        // test variables----could be replaced with user input
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;
        //Welcome Message
        System.out.println("Determine proteins in a DNA Strand!");
        System.out.println("");
        //find length of String DNA
        System.out.println("DNA Strand Length: " + dna.length());
        //find codon
        System.out.println("Start codon: " + dna.indexOf("ATG"));
        // find stop codon
        System.out.println("Stop codon: " + dna.indexOf("TGA"));
        //find out whether or not there is a protein
        // three conditions
        //1 to check for star codon
        //2 to check for stop codon
        //3 to check for nucleotides is a mutiple of three
        if (dna.indexOf("ATG") != -1 && dna.indexOf("TGA") != -1 && (dna.indexOf("TGA") - dna.indexOf("ATG")) % 3 == 0) {
            System.out.println("Condition 1 and 2 are satisfied.");
            String protein = dna.substring(dna.indexOf("ATG"), dna.indexOf("TGA") + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein.");
        }
    }
}