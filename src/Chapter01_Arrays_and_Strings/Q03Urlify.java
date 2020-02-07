package Chapter01_Arrays_and_Strings;

/**
 * Problem: Write a method to replace all spaces in a string with '%20'.
 *
 * You may assume that the string has sufficient space at the end to hold the additional characters, and that you
 * are given the "true" length  of the  string. (Note: If implementing in Java, please use a character array so that
 * you can perform this operation in place.)
 */
public class Q03Urlify {
    
    /**
     * Replaces ' ' with '%20'
     *
     * @param chars character array of the string
     * @param len   length of expanded word
     *
     * @return the manipulated string
     */
    public String replaceSpaces(char[] chars, int len) {
        if(chars == null) {
            return "";
        }
        
        int spaceCount = 0;
        int index = 0;
        
        for(int i = 0; i < len; i++) {
            if(chars[i] == ' ') {
                spaceCount++;
            }
        }
        
        index = len + spaceCount * 2 - 1;
        for(int i = len - 1; i >= 0; i--) {
            if(chars[i] == ' ') {
                chars[index] = '0';
                chars[index - 1] = '2';
                chars[index - 2] = '%';
                index -= 3;
            }
            else {
                chars[index] = chars[i];
                index--;
            }
        }
        
        return new String(chars).trim();
    }
    
    /**
     * Entry point for this program.
     *
     * @param args String arguments
     */
    public static void main(String[] args) {
        Q03Urlify q03Urlify = new Q03Urlify();
        char[] chars = "Mr John Smith       ".toCharArray();
        int length = 13;
        System.out.println(q03Urlify.replaceSpaces(chars, length));
    }
}
