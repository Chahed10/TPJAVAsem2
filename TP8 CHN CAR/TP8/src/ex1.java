/**
 * @(#)ex1.java
 *
 *
 * @author 
 * @version 1.00 2025/2/27
 */

public class ex1 {
        
    
    public static void main(String[] args) {
        
        
     import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Nom de variable corrig�
        System.out.println("Entrez une cha�ne :");
        String chaine = scanner.nextLine();

        if (chaine.length() > 0) {
            char premierCaractere = chaine.charAt(0);
            char dernierCaractere = chaine.charAt(chaine.length() - 1);
            System.out.println("Premier caract�re : " + premierCaractere);
            System.out.println("Dernier caract�re : " + dernierCaractere);
        } else {
            System.out.println("La cha�ne est vide.");
        }

        System.out.println("Cha�ne en majuscules : " + chaine.toUpperCase());
        scanner.close();
    }
}
