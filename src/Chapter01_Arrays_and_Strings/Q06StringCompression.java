package Chapter01_Arrays_and_Strings;

/**
 * Problem: Implement a method to perform basic string compression using the counts of repeated characters.
 *
 * For example, the string 'aabcccccaaa' would become 'a2blc5a3'. If the "compressed" string would not become smaller
 * than the original string, your method should return the original string. You can assume the string has only
 * uppercase and lowercase letters (a - z)
 */
public class Q06StringCompression {
    
    /**
     * Returns the compressed version of the String 's'
     * @param s the string to compress
     * @return the compressed version of String 's'
     */
    public String compress(String s) {
        StringBuilder compressedString = new StringBuilder();
        
        int countConsecutive = 0;
        for(int i = 0, length = s.length(); i < length; i++) {
            countConsecutive++;
            
            if(i + 1 >= length || s.charAt(i) != s.charAt(i + 1)) {
                // If the letter is different than the next, append letter with the count
                compressedString.append(s. charAt(i)).append(countConsecutive);
                
                countConsecutive = 0;
            }
        }
        return compressedString.length() < s.length() ? compressedString.toString() : s;
    }
    
    /**
     * Entry point for this program.
     *
     * @param args String arguments
     */
    public static void main(String[] args) {
        Q06StringCompression q06StringCompression = new Q06StringCompression();
        
        String s = "aabcccccaaa";
        System.out.println(s + " compressed: " + q06StringCompression.compress(s));
    }
}
