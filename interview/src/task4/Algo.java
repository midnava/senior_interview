package task4;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class Algo {
    private final Executor executor;

    public Algo(Executor executor) {
        this.executor = executor;
    }

    public void process(Order order) {
        executor.execute(() -> {
            LockSupport.parkNanos(TimeUnit.MICROSECONDS.toNanos(order.delayMs())); //simulation of work
            System.out.println("Executed Order: " + order);
        });
    }
}
