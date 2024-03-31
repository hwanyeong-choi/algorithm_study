import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[][] clothes) {
        final int CATEGORY_INDEX = 1;

        Map<String, Integer> map = new HashMap<>();

        Arrays.stream(clothes).forEach(clothe ->
                map.put(clothe[CATEGORY_INDEX], map.getOrDefault(clothe[CATEGORY_INDEX], 0) + 1));

        return map.values().stream().reduce(1, (acc, count) -> acc *= count + 1) - 1;
    }
}