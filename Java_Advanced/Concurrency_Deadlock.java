package Java_Advanced;
class Concurrency_Deadlock {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void methodA(){

        // Acquire lock1
        synchronized (lock1) {
            System.out.println("Thread 1: Holding lock 1");

            // Waits for lock2
            synchronized (lock2) {
                System.out.println("Thread 1: Holding lock 2");
            }
        }
    }

    public void methodB(){

        // Acquire lock2
        synchronized (lock2){
            System.out.println("Thread 2: Holding lock 2");

            // Waits for lock1
            synchronized (lock1){
                System.out.println("Thread 2: Holding lock 1");
            }
        }
    }

    public static void main(String[] args) {
        Concurrency_Deadlock example = new Concurrency_Deadlock();
        new Thread(example::methodA).start();
        new Thread(example::methodB).start();
    }
}