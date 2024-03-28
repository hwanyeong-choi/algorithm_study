import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        final int MAX_CHOICE_COUNT = nums.length / 2;
        Set<Integer> phoneKeMonList = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int phoneKeMonCategoryCount = phoneKeMonList.size();
        return Math.min(phoneKeMonCategoryCount, MAX_CHOICE_COUNT);
    }
}