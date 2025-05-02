package SecondWeekAssignments;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class DuplicateWordsChecker {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("apple");
        words.add("grape");
        words.add("banana");
        words.add("kiwi");

        HashSet<String> uniqueWords = new HashSet<>();
        HashSet<String> duplicateWords = new HashSet<>();

        for (String word : words) {
            if (!uniqueWords.add(word)) {
                duplicateWords.add(word);
            }
        }

        System.out.println("Words that appear more than once:");
        for (String duplicate : duplicateWords) {
            System.out.println(duplicate);
        }
    }
}
