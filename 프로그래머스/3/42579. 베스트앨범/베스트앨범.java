import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Map<Integer, Integer>> genresInfoMap = new HashMap<>();
        Map<String, Integer> genreTotalPlays = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            genresInfoMap.computeIfAbsent(genre, k -> new HashMap<>()).put(i, play);
            genreTotalPlays.merge(genre, play, Integer::sum);
        }

        List<String> sortedGenres = genreTotalPlays.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        for (String genre : sortedGenres) {
            genresInfoMap.get(genre).entrySet().stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder())
                            .thenComparing(Map.Entry.comparingByKey()))
                    .limit(2)
                    .forEachOrdered(entry -> result.add(entry.getKey()));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}