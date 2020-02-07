package Chapter01_Arrays_and_Strings;

/**
 * Problem: Given a string, write a function to check if it is a permutation of a palindrome.
 *
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 */
public class Q04PalindromePermutation {
    
    /**
     * Checks if the String 's' is a palindrome permutation by ensuring there are at most one letter not in a even pair.
     *
     * @param s the string to check
     *
     * @return true if 's' is a palindrome permutation, false otherwise
     */
    private boolean isPerm(String s) {
        if(s == null) {
            return false;
        }
        
        s = s.toLowerCase();
        
        int[] counts = new int[26];
        int countOdd = 0;
        for(char c : s.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
                
                if(counts[c - 'a'] % 2 == 1) {
                    countOdd++;
                }
                else {
                    countOdd--;
                }
            }
        }
        
        System.out.println(countOdd);
        return countOdd <= 1;
    }
    
    /**
     * Entry point for this program.
     *
     * @param args String arguments
     */
    public static void main(String[] args) {
        Q04PalindromePermutation q04PalindromePermutation = new Q04PalindromePermutation();
        String s = "tact coa";
        System.out.println("Is " + s + " a palindrome permutation?: " + q04PalindromePermutation.isPerm(s));
    }
}
