import java.util.*;

public class Main {
    public static void main(String[] args) {

        String string = "abcabcbb";
        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int counter = 0;

        while (right < string.length()) {

            char s = string.charAt(right);

            if (!set.contains(s)) {
                set.add(s);
                right++;
                counter = Math.max(counter, right - left);
            } else {
                set.remove(string.charAt(left));
                left++;
            }
        }

        System.out.println("Input:    " + string);
        System.out.println("Output:   " + counter);
        System.out.println("Substring: " + string.substring(left, right)); // note below
    }
}