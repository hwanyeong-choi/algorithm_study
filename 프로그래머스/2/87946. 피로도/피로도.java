import java.util.ArrayList;
import java.util.List;

class Solution {
    static final int MINIMUM_FATIGUE_INDEX = 0;
    static final int FATIGUE_COST_INDEX = 1;

    public static int[][] generatePermutations(int n) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int i = 0; i < n; i++) {
            List<List<Integer>> current = new ArrayList<>();

            for (List<Integer> l : result) {
                for (int j = 0; j <= l.size(); j++) {
                    l.add(j, i);
                    current.add(new ArrayList<>(l));
                    l.remove(j);
                }
            }

            result = current;
        }

        int[][] permutations = new int[result.size()][n];
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < n; j++) {
                permutations[i][j] = result.get(i).get(j);
            }
        }

        return permutations;
    }


    public static int solution(int k, int[][] dungeons) {

        int[][] indexVowelsArray = generatePermutations(dungeons.length);
        int result = 0;

        for (int[] indexArray : indexVowelsArray) {
            int pirodo = k;
            int resultCount = 0;
            for (int index : indexArray) {
                if (pirodo >= dungeons[index][MINIMUM_FATIGUE_INDEX]) {
                    resultCount++;
                    pirodo -= dungeons[index][FATIGUE_COST_INDEX];
                }
            }
            result = Math.max(result, resultCount);
        }

        return result;
    }
}