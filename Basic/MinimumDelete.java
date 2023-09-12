import java.util.*;
public class MinimumDelete {
    public int minDeletions(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        for (char c : s.toCharArray()) {
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }

        Set<Integer> freqSet = new HashSet<>();
        int count = 0;

        for (int freq : chars.values()) {
            while (freq > 0 && freqSet.contains(freq)) {
                freq--;
                count++;
            }
            freqSet.add(freq);
        }
        return count;
    }

    public static void main(String[] args) {
        MinimumDelete str = new MinimumDelete();
        String input = "examplestring";
        int result = str.minDeletions(input);
        System.out.println("Minimum deletions required: " + result);
    }
}
