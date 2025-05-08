/**
 * @(#)ex1.java
 *
 *
 * @author 
 * @version 1.00 2025/5/8
 */

public class ex1 {
        
  

    public static double somme(double[] t) {
        double total = 0;
        for (double v : t) total += v;
        return total;
    }

    public static void incre(double[] t, double val) {
        for (int i = 0; i < t.length; i++) {
            t[i] += val;
        }
    }

    public static void affiche(double[] t) {
        for (double v : t) System.out.print(v + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        double[] tab = {1.5, 2.0, 3.5};
        System.out.print("Tableau initial : ");
        affiche(tab);

        System.out.println("Somme : " + somme(tab));

        incre(tab, 2.0);
        System.out.print("Après incrémentation de 2.0 : ");
        affiche(tab);
    }
}
  