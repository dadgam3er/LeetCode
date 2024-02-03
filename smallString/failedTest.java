import java.util.HashMap;
import java.util.Map;

public class failedTest {
    public static int getAnagramPeriod(String input_str) {
        int len = input_str.length();
        Map<Character, Integer> freqMap = new HashMap<>();

        // Count the frequency of each character in the input string
        for (char c : input_str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int period = freqMap.size(); // Anagram period initially equals the count of unique characters

        return period;
    }

    public static int getSmallestPossibleStringLength(String input_str) {
        int period = getAnagramPeriod(input_str);
        int len = input_str.length();

        return len / period;
    }

    public static void main(String[] args) {
        String input = "abbbabbabababbbbbaaaaaaababa"; // Replace this with your input string
        int smallestLength = getSmallestPossibleStringLength(input);
        System.out.println("The length of the smallest possible string is: " + smallestLength);
    }
}

