import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> consecutiveNumberRemovalList = new ArrayList<>(List.of(arr[0]));
        
        for (int i = 1; i < arr.length; i++)  {
            if (arr[i - 1] != arr[i]) {
                consecutiveNumberRemovalList.add(arr[i]);
            }
        }
        
        return consecutiveNumberRemovalList.stream().mapToInt(Integer::intValue).toArray();
    }
}