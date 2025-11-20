public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Background Task 1: Processing data...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background Task 1: Completed");
        };
        
        Runnable task2 = () -> {
            System.out.println("Background Task 2: Sending emails...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background Task 2: Completed");
        };
        
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("All background tasks completed");
    }
}