class Solution {
    public String solution(int a, int b) {
        final int MONTH = a - 1;
        final int WEEK_DAY = 7;
        final int DATE_ADJUSTMENT_CONSTANT = 1;
        final int[] MONTH_DAY_LIST = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        final String[] DAY_LIST = new String[]{"FRI","SAT", "SUN","MON","TUE","WED","THU"};

        int totalDays = b;

        for (int i = 0; i < MONTH; i++) totalDays += MONTH_DAY_LIST[i];

        return DAY_LIST[(totalDays - DATE_ADJUSTMENT_CONSTANT) % WEEK_DAY];
    }
}