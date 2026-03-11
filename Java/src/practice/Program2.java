package practice;

import java.util.HashMap;

public class Program2 {
    public static void main(String[] args) {
        String s = "abcabc";
        HashMap<Character, Integer> map = new HashMap<>();
        int j = 0, longest = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int newJ = map.get(s.charAt(i)) + 1;
                if (newJ > j) {
                    j = newJ;
                }
            }
            map.put(s.charAt(i), i);

            int newLength = i - j + 1;
            if (newLength > longest) {
                longest = newLength;
            }
        }

        System.out.println("Length of longest substring: " + longest);
    }
}

