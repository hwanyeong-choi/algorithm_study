class Solution {
        public int solution(int n) {

        StringBuilder ternary = new StringBuilder();
        int answer = 0;
        int power = 0;


        while (n > 0) {
            int remainder = n % 3;
            ternary.insert(0, remainder);
            n /= 3;
        }


        ternary.reverse();


        for (int i = ternary.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(ternary.charAt(i));
            answer += digit * Math.pow(3, power);
            power++;
        }

        return answer;
    }
}