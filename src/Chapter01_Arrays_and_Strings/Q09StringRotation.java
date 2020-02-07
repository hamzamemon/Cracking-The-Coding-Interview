package Chapter01_Arrays_and_Strings;

/**
 * Problem: Assume you have a method isSubstring which checks if one word is a substring of another. Given two
 * Strings, check if s2 is a rotation of s1 using only one call to isSubstring
 */
public class Q09StringRotation {
    
    /**
     * Checks if String 's1' is a rotation of String 's2'
     *
     * @param s1 first string
     * @param s2 second string
     *
     * @return true if the two strings are rotations, false if otherwise
     */
    public boolean isRotation(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }
        
        return isSubstring((s1 + s2), s1);
    }
    
    /**
     * Checks if String 'string' contains String 's'
     *
     * @param string concatenation of String 's1' and String 's2'
     * @param s      String 's1'
     *
     * @return true if String 'string' contains String 's'
     */
    private boolean isSubstring(String string, String s) {
        return string.contains(s);
    }
    
    /**
     * Entry point for this program.
     *
     * @param args String arguments
     */
    public static void main(String[] args) {
        Q09StringRotation q09StringRotation = new Q09StringRotation();
        System.out.println(q09StringRotation.isRotation("abcd", "cdab"));
    }
}
