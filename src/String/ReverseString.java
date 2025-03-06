package String;

public class ReverseString {
    public static String reverse(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
