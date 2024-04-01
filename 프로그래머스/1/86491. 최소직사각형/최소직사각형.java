import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        final int WIDTH_INDEX = 0;
        final int HEIGHT_INDEX = 1;

        List<Integer> bigSizeList = new ArrayList<>();
        List<Integer> smallSizeList = new ArrayList<>();

        for (int[] size : sizes) {
            bigSizeList.add(Math.max(size[WIDTH_INDEX], size[HEIGHT_INDEX]));
            smallSizeList.add(Math.min(size[WIDTH_INDEX], size[HEIGHT_INDEX]));
        }

        return bigSizeList.stream().mapToInt(Integer::intValue).max().orElse(0) *
                smallSizeList.stream().mapToInt(Integer::intValue).max().orElse(0);
    }
}