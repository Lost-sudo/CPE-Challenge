package String;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {
    public static char mostFrequent(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        char maxChar = ' ';
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            if (charCount.get(ch) > maxCount) {
                maxCount = charCount.get(ch);
                maxChar = ch;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent("banana"));
    }
}
