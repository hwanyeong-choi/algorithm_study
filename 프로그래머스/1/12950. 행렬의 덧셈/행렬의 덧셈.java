class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int oneDepth = arr1.length;
        int twoDepth = arr1[0].length;

        int[][] answer = new int[oneDepth][twoDepth];

        for (int i = 0; i < oneDepth; i++)
            for (int j = 0; j < twoDepth; j++)
                answer[i][j] = arr1[i][j] + arr2[i][j];

        return answer;
    }
}