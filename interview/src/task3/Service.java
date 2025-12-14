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

    //T1, T3, T5 are blocked
    public synchronized void incrementA() {
        counter++; //T0 - long operation
        // Which thread acquires the lock next after it is released?
    }

    public static synchronized void incrementB() {
        counter++;
    }


    //Question N2
    //T1, T3, T5 are blocked
    public synchronized void incrementC() {
        counter++; //T0 - long operation
        // Which thread acquires the lock next after it is released?
    }
}