import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();

        customerQueue.add("Alice");
        customerQueue.add("Bob");
        customerQueue.add("Charlie");
        customerQueue.add("Diana");
        customerQueue.add("Ethan");

        while (!customerQueue.isEmpty()) {
            String customer = customerQueue.poll(); // Removes and returns the head of the queue
            System.out.println("Serving customer: " + customer);
        }
    }
}
