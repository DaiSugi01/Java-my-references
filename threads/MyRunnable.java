package exercise.java.threads;

/**
 * This class is a Runnable object which is the thread's job.
 * You must override run() method.
 * and it's going to run when the thread starts.
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("[MyRunnable] run() " + Thread.currentThread().getName() + " is running.");
    }

}
