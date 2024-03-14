import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++)
            for (int j = i+1; j < numbers.length; j++)
                integerSet.add(numbers[i] + numbers[j]);

        int[] answer = integerSet.stream().mapToInt(it -> it).sorted().toArray();
        return answer;
    }
}