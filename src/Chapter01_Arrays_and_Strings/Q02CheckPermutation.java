package Chapter01_Arrays_and_Strings;

/**
 * Problem: Given two strings, write a method to decide if one is a permutation of the other.
 */
public class Q02CheckPermutation {
    
    /**
     * Checks if String "s1" is a palindrome of String "s2".
     * Assumes characters with values of at most 256.
     *
     * @param s1 input string 1
     * @param s2 input string 2
     *
     * @return true if strings are palindromes of each other, false if otherwise
     */
    private boolean permutation(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() != s2.length() || s1.length() > 256) {
            return false;
        }
        
        int[] counts = new int[256];
        char[] s1CharArray = s1.toCharArray();
        for(char ch : s1CharArray) {
            counts[ch]++;
        }
        
        char[] s2CharArray = s2.toCharArray();
        for(char ch : s2CharArray) {
            counts[ch]--;
            if(counts[ch] < 0) {
                return false;
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
                {"banana", "bananb"},
                {"banana", "ananab"},
                {"turnip", "pinrur"},
                {"tomato", "otamot"}
        };
        
        Q02CheckPermutation q02CheckPermutation = new Q02CheckPermutation();
        for(String[] pair : strings) {
            String s1 = pair[0];
            String s2 = pair[1];
            
            boolean isPalindrome = q02CheckPermutation.permutation(s1, s2);
            System.out.println("Is " + s1 + ", " + s2 + " a permutation?: " + isPalindrome);
        }
    }
}
