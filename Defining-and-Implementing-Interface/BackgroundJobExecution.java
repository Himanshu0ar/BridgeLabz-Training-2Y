public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Data backup started...");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.println("Data backup completed.");
        };

        Runnable task2 = () -> {
            System.out.println("Email notification started...");
            try { Thread.sleep(1500); } catch (InterruptedException e) {}
            System.out.println("Email notification completed.");
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        System.out.println("Main thread finished launching background tasks.");
    }
}
