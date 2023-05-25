import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicateRemoval {
    public static int[] removeDuplicates(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: array) {
            map.putIfAbsent(i, i);
        }

        int[] newArray = map.keySet().stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return newArray;
    }
}
