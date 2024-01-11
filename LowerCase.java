/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String new_str = "";
        int str_len = s.length();

        for (int i = 0; i < str_len; i++){
            // int asciiValue = (int) s.charAt(i);

            // checks if chr between A and Z and change accordingly
            char cur_chr = s.charAt(i);
            if (cur_chr <= 'Z' && 'A' <= cur_chr){
                char smallLetter = Character.toLowerCase(s.charAt(i));
                new_str += smallLetter;
            }
            else{
                new_str += s.charAt(i);
            }
        }

        return new_str;
    }
}