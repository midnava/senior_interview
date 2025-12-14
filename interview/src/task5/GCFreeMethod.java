package task5;

/**
 * Refactor this method to be GC-free.
 * <p>
 * Duration 10 minutes.
 */
public class GCFreeMethod {

    public void doSomethingWithList() {
        StringBuilder builder = new StringBuilder(); // avoid allocating on every call

        builder.append("StartTime:").append(System.currentTimeMillis());

        // How can we make this logging GC-free?
        System.out.println("Log: " + builder); //simulation of logging
    }
}