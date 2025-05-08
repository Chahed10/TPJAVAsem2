/**
 * @(#)maxtb.java
 *
 *
 * @author 
 * @version 1.00 2025/5/8
 */

public class maxtb {

    public static int maxTableau(int[] tableau) {
        if (tableau.length == 0) {
            throw new IllegalArgumentException("Un tableau vide n'a pas de maximum");
        }
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] t = {8}; 
        System.out.println("Le maximum est : " + maxTableau(t)); 
    }
}