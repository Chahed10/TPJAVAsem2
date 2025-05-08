/**
 * @(#)ex5.java
 *
 *
 * @author 
 * @version 1.00 2025/5/8
 */

public class ex5 {

    public static void affiche(double[][] t) {
        for (double[] ligne : t) {
            for (double val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static boolean regulier(double[][] t) {
        if (t.length == 0) return true;
        int taille = t[0].length;
        for (double[] ligne : t) {
            if (ligne.length != taille) return false;
        }
        return true;
    }
    public static double[] sommelignes(double[][] t) {
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (double val : t[i]) {
                sommes[i] += val;
            }
        }
        return sommes;
    }
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2)) return null;
        if (t1.length != t2.length || t1[0].length != t2[0].length) return null;

        double[][] resultat = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[0].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultat;
    }
    public static void main(String[] args) {
        double[][] t1 = {{1.5, 2.0}, {3.0, 4.5}};
        double[][] t2 = {{0.5, 1.0}, {2.0, 3.5}};

        System.out.println("Tableau 1 :");
        affiche(t1);
        System.out.println("Régulier ? " + regulier(t1));

        double[][] sommeTab = somme(t1, t2);
        System.out.println("Somme des tableaux :");
        if (sommeTab != null) {
            affiche(sommeTab);
        } else {
            System.out.println("Somme impossible (tailles incompatibles ou irrégularité).");
        }
    }
}
  