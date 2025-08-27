/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */


public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptOne() function.
        for (int i=0; i<encrypted.length(); i++)
        {
            char c = encrypted.charAt(i);
            char p;
            if (Character.isUpperCase(c))
            {
                p = (char) (((int) c + 9 - 'A') % 26 + 'A');
            }
            else
            {
                p = (char) (((int) c + 9 - 'a') % 26 + 'a');
            }
            decrypted = decrypted + String.valueOf(p);
        }

        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";

        String[] nums = encrypted.split(" ");

        for (int i=0; i<nums.length; i++)
        {
            char c = (char) ((int) nums[i]);
            decrypted = decrypted + String.valueOf(c);
        }
        // TODO: Complete the decryptTwo() function.

        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";


        for (int i=0; i<encrypted.length/8; i++)
        {
            String num = encrypted.substring(i * 8, i * 8 + 8);
            char c = (char) Integer.parseInt(num, 2);
            decrypted = decrypted + String.valueOf(c);
        }

        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        for (int i=0; i<encrypted.length; i++)
        {
            char c = (char)((int) encrypted.charAt(i) - 9919);
            decrypted = decrypted + String.valueOf(c);
        }
        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
