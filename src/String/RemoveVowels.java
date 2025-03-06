package String;

public class RemoveVowels {
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiuoAEIUO]", "");
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("hello, world"));
    }
}
