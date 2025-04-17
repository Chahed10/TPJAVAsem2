/**
 * @(#)exercice3.java
 *
 *
 * @author 
 * @version 1.00 2025/4/17
 */

public class exercice3 {
   
    public static boolean EstInf(String verbe) {
        return verbe.endsWith("er")
            || verbe.endsWith("ir")
            || verbe.endsWith("re")
            || verbe.endsWith("oir");
    }
    public static int Groupe(String verbe) {
        if (verbe.equals("aller")) {
            return 3;
        } else if (verbe.endsWith("er")) {
            return 1;
        } else if (verbe.endsWith("ir")) {
            return 2;
        } else {
            return 3;
        }
    }
    public static void main(String[] args) {
        
       
    }
}
