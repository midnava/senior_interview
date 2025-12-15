package task3;

/**
 * Is this implementation thread-safe?
 * What is the difference between `public synchronized` and `public static synchronized`?
 * What equivalent mechanisms can be used instead of `synchronized`?
 * <p>
 * Duration: 10 minutes.
 */
public class Service {
    private static int counter = 0;

    public synchronized void incrementA() {
        counter++;
    }

    public static synchronized void incrementB() {
        counter++;
    }




    //------------------------------------------------------------------------
    //Additional question
    //T1, T3, T5 threads are blocked in that order
    public synchronized void incrementC() {
        counter++; //T0 thread here - long operation
        // Which thread acquires the lock next after it is released?
    }
}