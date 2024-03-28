import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> consecutiveNumberRemovalQueue = new LinkedList<>(List.of(arr[0]));
        for (int i = 1; i < arr.length; i++)  {
            if (arr[i - 1] != arr[i]) {
                consecutiveNumberRemovalQueue.offer(arr[i]);
            }
        }
        return consecutiveNumberRemovalQueue.stream().mapToInt(Integer::intValue).toArray();
    }
}