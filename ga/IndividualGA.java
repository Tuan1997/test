package ga;

import java.util.Random;


public class IndividualGA {

    int fitness = 0;
    int[] genes = new int[5];
    int geneLength = 5;

    public IndividualGA() {
        Random rn = new Random();

        //Set genes randomly for each individual
        for (int i = 0; i < genes.length; i++) {
            genes[i] = Math.abs(rn.nextInt(2));
            
        }

        fitness = 0;
    }

    //Calculate fitness
    public void calcFitness() {

        fitness = 0;
        for (int i = 0; i < 5; i++) {
            if (genes[i] == 1) {
                ++fitness;
            }
        }
    }
//    public static void  main(String[] args) {
//    	IndividualGA i = new IndividualGA();
//    }

}