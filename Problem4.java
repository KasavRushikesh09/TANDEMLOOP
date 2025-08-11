import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] base = {1,2,3,4,5,6,7,8,9};
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> result = new HashMap<>();

        for (int b : base) {
            int count = 0;
            for (int num : input) {
                if (num % b == 0) {
                    count++;
                }
            }
            result.put(b, count);
        }

        System.out.println(result);
    }
}