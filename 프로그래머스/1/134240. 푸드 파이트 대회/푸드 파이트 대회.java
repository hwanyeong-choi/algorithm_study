class Solution {
    public String solution(int[] food) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < food.length; i++) {

            if ((food[i] & 1) == 0 && food[i] > 1)
                for (int j = 0; j < (food[i] / 2); j++) result.append(i);

            if (((food[i] & 1) == 1) && ((food[i] - 1) > 1))
                for (int j = 0; j < (food[i] / 2); j++) result.append(i);

        }

        int resultLength = result.length();

        result.append(0);

        for (int i = resultLength - 1; i > -1; i--) {
            result.append(result.charAt(i));
        }

        String answer = result .toString();
        return answer;
    }
}