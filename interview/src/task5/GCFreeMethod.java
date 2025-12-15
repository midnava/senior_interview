package task5;

import java.util.HashMap;
import java.util.Map;

/**
 * Refactor this method to be GC-free.
 * <p>
 * Duration 10 minutes.
 */
public class GCFreeMethod {
    private final Map<Integer, Double> map = new HashMap<>();

    public void put(int id, double price) {
        map.put(id, price); //any performance issue?
    }

    public void doSomethingWithList() {
        StringBuilder builder = new StringBuilder(); // avoid allocating on every call

        builder.append("StartTime:").append(System.currentTimeMillis());

        // How can we make this logging GC-free?
        System.out.println("Log: " + builder); //simulation of logging
    }
}