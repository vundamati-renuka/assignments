package SecondWeekAssignments;
import java.util.PriorityQueue;
import java.util.Comparator;

public class ReverseAlphabeticalPriorityQueue {
    public static void main(String[] args) {
        Comparator<String> reverseComparator = (str1, str2) -> str2.compareTo(str1);

        PriorityQueue<String> queue = new PriorityQueue<>(reverseComparator);

        queue.add("dog");
        queue.add("cat");
        queue.add("elephant");
        queue.add("apple");
        queue.add("banana");

        System.out.println("PriorityQueue elements in descending order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
