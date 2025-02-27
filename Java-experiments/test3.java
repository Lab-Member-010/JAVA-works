public class test3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running: " + Thread.currentThread().getName() + " - " + i);
            }
        });
        t1.start();
        System.out.println("Main thread is done!");
    }
}