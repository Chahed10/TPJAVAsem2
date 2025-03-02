/**
 * @(#)Application 1.java
 *
 *
 * @author 
 * @version 1.00 2025/3/2
 */

public class Application 1 {
        
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String ch = scanner.nextLine();
        System.out.print("Entrez un caractère à chercher : ");
        char car = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == car) {
                count++;
            }
        }
        System.out.println("Le caractère '" + car + "' apparaît " + count + " fois.");
        scanner.close();
    }
}

        
        
        
    }
}
