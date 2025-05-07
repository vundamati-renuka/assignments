package ThirdWeekAssignments;

class Counter {
    private int count = 0;

    // synchronized method to safely increment the count
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create a task that increments the counter 1000 times
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        // Create two threads
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count (should be 2000)
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
