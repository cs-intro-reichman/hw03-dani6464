/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String new_str = "";
        int str_len = s.length();

        // loop through each chr in string
        for (int i = 0; i < str_len; i++){
            boolean isDuplicate = false;
            // check for duplicate chrs
            for (int j = 0; j < i; j++){
                if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' '){
                    isDuplicate = true;
                    break;
                }
            }
            // add the chr if it's not duplicate
            if (!isDuplicate){
                new_str += s.charAt(i);
            }
        }

        return new_str;
    }
}