package exercise.java.threads;

/**
 * Basic Usage.
 *  1. Make a Runnable object which is the thread's job.
 *  2. Make a Thread object, which is the worker, and give it a Runnable object.
 *  3. Start the Thread.
 */
public class Driver {

    public static void main(String[] args) {

        // 1. Make a Runnable object which is the thread's job.
        MyRunnable threadJob = new MyRunnable();

        // 2. Make a Thread object, which is the worker, and give it a Runnable object.
        Thread t1 = new Thread(threadJob);
        Thread t2 = new Thread(threadJob);
        Thread t3 = new Thread(threadJob);

        // Set a name. (this is optional)
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        // 3. Start the Thread.
        t1.start();
        t2.start();
        t3.start();

        try {
            // wait for thread 1
            t1.join();
            // wait for thread 2
            t2.join();
            System.out.println("This is main method.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
