package EasyProblems;

public class PrefixLengthFinder {
    public static String longestCommonPrefix(String[] strs) {
        String output = "";
        char c = ' ';

        for (int i = 0; i < strs[0].length(); i++) {
            c = strs[0].charAt(i);
            int counter = 0;

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i ||
                        c != strs[j].charAt(i)) {
                    counter = 0;
                    break;
                } else {
                    counter++;
                }
            }

            if (counter == strs.length - 1) {
                output = output + c;
            } else {
                break;
            }
        }

        return output;
    }
}
