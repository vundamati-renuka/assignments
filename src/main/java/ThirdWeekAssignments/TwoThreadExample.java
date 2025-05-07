package ThirdWeekAssignments;

public class TwoThreadExample {

    public static void main(String[] args) {

        // Thread to print numbers
        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
                try {
                    Thread.sleep(500); // Sleep for half a second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread to print name
        Thread nameThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Name: Renuka");
                try {
                    Thread.sleep(500); // Sleep for half a second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        numberThread.start();
        nameThread.start();
    }
}

