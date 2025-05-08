/**
 * @(#)tri.java
 *
 *
 * @author 
 * @version 1.00 2025/5/8
 */

        
   import java.util.Scanner;
import java.util.Arrays;

public class tri {

    public static int[] remplir(int taille) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[taille];
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrer l'entier n°" + (i + 1) + " : ");
            t[i] = sc.nextInt();
        }
        return t;
    }

    public static void tri(int[] t) {
        Arrays.sort(t);
    }

    public static void affiche(int[] t) {
        for (int val : t) System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner un entier (taille du tableau) : ");
        int n = sc.nextInt();

        int[] t = remplir(n);
        System.out.print("Avant tri : ");
        affiche(t);

        tri(t);
        System.out.print("Après tri : ");
        affiche(t);
    }
}