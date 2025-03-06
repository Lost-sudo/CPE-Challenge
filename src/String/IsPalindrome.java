package String;

public class IsPalindrome {
    public static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }
}
