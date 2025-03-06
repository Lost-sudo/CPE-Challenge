package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
