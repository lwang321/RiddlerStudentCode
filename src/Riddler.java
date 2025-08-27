/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Lucas Wang
 */


public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";

        for (int i=0; i<encrypted.length(); i++)
        {
            char c = encrypted.charAt(i);
            char p;

            if (c == ' ' || c == ',' || c == '.' || c == ':' || c == '’')
            {
                p = c;
            }
            else if (Character.isUpperCase(c))
            {
                p = (char) (((int) c + 9 - 'A') % 26 + 'A');
            }
            else
            {
                p = (char) (((int) c + 9 - 'a') % 26 + 'a');
            }
            decrypted = decrypted + String.valueOf(p);
        }
        System.out.println(decrypted);

        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";

        String[] nums = encrypted.split(" ");

        for (int i=0; i<nums.length; i++)
        {
            char c = (char) (Integer.parseInt(nums[i], 10));
            decrypted = decrypted + String.valueOf(c);
        }
        System.out.println(decrypted);
        return decrypted;

    }

    public String decryptThree(String encrypted) {
        String decrypted = "";


        for (int i=0; i<encrypted.length()/8; i++)
        {
            String num = encrypted.substring(i * 8, i * 8 + 8);
            char c = (char) Integer.parseInt(num, 2);
            decrypted = decrypted + String.valueOf(c);
        }

        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        for (int i=0; i<encrypted.length(); i++)
        {
            char c = (char)((int) encrypted.charAt(i) - 9919);
            decrypted = decrypted + String.valueOf(c);
        }
        System.out.println(decrypted);
        return decrypted;
    }
}
