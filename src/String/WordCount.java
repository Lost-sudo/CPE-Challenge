package String;

public class WordCount {
    public static int wordCount(String str) {
        return str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("hello, world, again"));
    }
}
