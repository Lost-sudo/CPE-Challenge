package String;

public class LongestWord {
    public static String longestWord(String str) {
        String[] words = str.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestWord("The quick brown fox"));
    }
}
