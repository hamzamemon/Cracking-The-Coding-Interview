package Chapter01_Arrays_and_Strings;

/**
 * Problem: Implement an algorithm to determine if a string has all unique characters.
 */
public class Q01IsUnique {
    
    /**
     * Checks if all characters in String "s" are unique.
     * Assumes characters with values of at most 256.
     *
     * @param s input string
     *
     * @return true if unique, false if not unique
     */
    private boolean isUnique(String s) {
        if(s == null || s.length() > 256) {
            return false;
        }
        
        boolean[] charSet = new boolean[256];
        char[] chars = s.toCharArray();
        for(char ch : chars) {
            if(charSet[ch]) {
                return false;
            }
            
            charSet[ch] = true;
        }
        
        return true;
    }
    
    /**
     * Entry point for this program.
     *
     * @param args String arguments
     */
    public static void main(String[] args) {
        String[] words = {"abcde", "bye", "orange", "banana", "house", "cologne"};
        
        Q01IsUnique q01IsUnique = new Q01IsUnique();
        for(String word : words) {
            System.out.println("Is " + word + " unique?: " + q01IsUnique.isUnique(word));
        }
    }
}
