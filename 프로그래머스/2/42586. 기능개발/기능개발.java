import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 1;
        int dailyWorkloadCount = 0;

        Queue<Integer> progressesQueue = Arrays.stream(progresses)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        Queue<Integer> speedsQueue = Arrays.stream(speeds)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        List<Integer> dailyWorkloadList = new ArrayList<>();


       do {

           int dailyWorkload = 0;

            while (progressesQueue.peek() != null && !((progressesQueue.peek() + (day * speedsQueue.peek())) < 100)) {
                progressesQueue.poll();
                speedsQueue.poll();
                dailyWorkload++;
            }



            if (dailyWorkload == 0) {
                day++;
                continue;
            };

           dailyWorkloadList.add(dailyWorkload);
           day++;



        } while (!progressesQueue.isEmpty());

       return dailyWorkloadList.stream().mapToInt(Integer::intValue).toArray();
    }
}