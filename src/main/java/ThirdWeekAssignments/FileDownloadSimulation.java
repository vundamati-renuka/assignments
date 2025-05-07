package ThirdWeekAssignments;

public class FileDownloadSimulation {

    public static void main(String[] args) {

        // Define a class that simulates file download
        class DownloadTask extends Thread {
            private String fileName;

            public DownloadTask(String fileName) {
                this.fileName = fileName;
            }

            @Override
            public void run() {
                System.out.println("Starting download: " + fileName);

                try {
                    // Simulate time taken to download (1-3 seconds)
                    Thread.sleep((int)(Math.random() * 2000 + 1000));
                } catch (InterruptedException e) {
                    System.out.println("Download interrupted: " + fileName);
                }

                System.out.println("Download complete: " + fileName);
                processFile();
            }

            private void processFile() {
                System.out.println("Processing file: " + fileName);
                // Simulate processing time
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Processing interrupted: " + fileName);
                }
                System.out.println("Finished processing: " + fileName);
            }
        }

        // Start three download tasks
        Thread t1 = new DownloadTask("file1.mp4");
        Thread t2 = new DownloadTask("file2.pdf");
        Thread t3 = new DownloadTask("file3.zip");

        t1.start();
        t2.start();
        t3.start();
    }
}

