import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        
        String result = Arrays.stream(numbers)
                .boxed()
                .sorted((o1, o2) -> {
                    String s1 = o2.toString() + o1.toString();
                    String s2 = o1.toString() + o2.toString();
                    return s1.compareTo(s2);
                })
                .map(String::valueOf)
                .collect(Collectors.joining());

        if (result.charAt(0) == '0') return "0";

        return result;
        
    }
}