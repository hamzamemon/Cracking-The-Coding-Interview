package Chapter01_Arrays_and_Strings;

/**
 * Problem: There are three types of edits that can be performed on  strings:
 * * Insert a character
 * * Remove  a character
 * * Replace  a  character.
 *
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 */
public class Q05OneAway {
    
    /**
     * Determines which method to call, insert, replace or "delete"
     *
     * @param s1 first string
     * @param s2 second string
     *
     * @return true if two strings are edit away
     */
    private boolean isOneEditAway(String s1, String s2) {
        if(s1 == null || s2 == null) {
            return false;
        }
        if(s1.length() == s2.length()) {
            return isOneReplaceAway(s1, s2);
        }
        if(s1.length() + 1 == s2.length()) {
            return isOneInsertAway(s1, s2);
        }
        if(s1.length() - 1 == s2.length()) {
            return isOneInsertAway(s2, s1);
        }
        return false;
    }
    
    /**
     * Checks if replacing a letter in a string will result in the other
     *
     * @param s1 first string
     * @param s2 second string
     *
     * @return true if the replacement with result in the other string
     */
    private boolean isOneReplaceAway(String s1, String s2) {
        boolean foundReplacement = false;
        for(int i = 0, length = s1.length(); i < length; i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(foundReplacement) {
                    return false;
                }
                
                foundReplacement = true;
            }
        }
        return true;
    }
    
    /**
     * Checks if inserting a character into String 's1' to create String 's2'
     *
     * @param s1 first string to convert
     * @param s2 second string
     *
     * @return true if 's1' can be converted to 's2'
     */
    private boolean isOneInsertAway(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        
        while(index1 < s1.length() && index2 < s2.length()) {
            if(s1.charAt(index1) != s2.charAt(index2)) {
                if(index1 != index2) {
                    return false;
                }
                index2++;
            }
            else {
                index1++;
                index2++;
            }
        }
        
        return true;
    }
    
    /**
     * Entry point for this program.
     *
     * @param args String arguments
     */
    public static void main(String[] args) {
        String[][] strings = {
                {"pale", "pie"},
                {"pales", "pale"},
                {"pale", "bale"},
                {"pale", "bake"},
                {"pale", "pale"}
        };
        
        Q05OneAway q05OneAway = new Q05OneAway();
        for(String[] pair : strings) {
            String s1 = pair[0];
            String s2 = pair[1];
            
            boolean isPalindrome = q05OneAway.isOneEditAway(s1, s2);
            System.out.println("Are " + s1 + " and " + s2 + " one edit away?: " + isPalindrome);
        }
    }
}
