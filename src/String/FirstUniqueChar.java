package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static char firstNonRepeating(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1) return ch;
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("swiss"));
    }
}
