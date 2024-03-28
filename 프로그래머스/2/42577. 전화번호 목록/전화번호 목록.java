import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        int minLength = 9000000;
        Map<String, String> map = new HashMap<>();

        for (String tempString : phone_book) minLength = Math.min(minLength, tempString.length());
        Arrays.sort(phone_book);

        for (String tempString : phone_book) {

            String key = tempString.substring(0, minLength);

            if (map.containsKey(key)) {
                String value = map.get(key);
                if (tempString.startsWith(value)) return false;
            }
            map.put(key, tempString);

        }

        return true;
    }
}