import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int citationLength = citations.length;

        for (int i = 0; i < citationLength; i++) {
            int hIndex = citationLength - i;
            if (citations[i] >= hIndex) {
                return hIndex;
            }
        }

        return 0;
    }
}