package Strings;

public class StringsCompression {

    // Input :- "aaabbcccdd"
    // Output :- "a3b2c3d2"

    public static String compressString(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1; // reset count
            }
        }

        // Handle last character
        sb.append(str.charAt(str.length() - 1));
        if (count > 1) {
            sb.append(count);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println("The compressed string is: " + compressString(str));
    }
}