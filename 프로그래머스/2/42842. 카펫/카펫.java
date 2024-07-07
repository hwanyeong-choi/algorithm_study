
class Solution {
    public int[] solution(int brown, int yellow) {
        
       int sum = brown + yellow;
        int range = (sum / 2);

        for (int i = 3; i <= range; i++) {

            int j = sum / i;

            if (sum % i == 0 && j >= 3) {
                int width = Math.max(i, j);
                int height = Math.min(i, j);
                int center = (width - 2) * (height - 2);

                if (center == yellow) {
                    return new int[]{width, height};
                }

            }
        }

        return new int[]{};
        
    }
}