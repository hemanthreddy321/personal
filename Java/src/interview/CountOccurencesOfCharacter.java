package interview;

import java.util.HashMap;

public class CountOccurencesOfCharacter {
    public static void main(String[] args) {
        String str = "hemanth";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

    }
}
