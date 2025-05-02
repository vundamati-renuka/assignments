package SecondWeekAssignments;
import java.util.TreeSet;

public class WordFilter {
    public static void main(String[] args) {
        TreeSet<String> words = new TreeSet<>();

        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("blueberry");
        words.add("apricot");
        words.add("blackberry");
        words.add("date");

        System.out.println("Words starting with 'b' or greater than 'banana':");
        for (String word : words.tailSet("banana")) {
            System.out.println(word);
        }
    }
}

