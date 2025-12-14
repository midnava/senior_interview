package task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * You are reviewing a Merge Request where the dev wants to improve performance
 * by replacing `Executors.newSingleThreadExecutor()` with `Executors.newFixedThreadPool(10)`.
 * Is it safe to make this change?
 * What could happen if we switch to multiple threads instead of a single thread?
 * <p>
 * Duration 15 minutes
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Algo algo = new Algo(executor);

        Order order1_new = new Order(1, Order.Status.NEW, "ISIN_1", 200); //delayMs - just simulation of work
        Order order1_partialFilled = new Order(1, Order.Status.PARTIALLY_FILLED, "ISIN_1", 100);
        Order order1_cancelled = new Order(1, Order.Status.CANCELLED, "ISIN_1", 10);

        Order order2_new = new Order(2, Order.Status.NEW, "ISIN_2", 200); //delayMs - just simulation of work
        Order order2_partialFilled = new Order(2, Order.Status.PARTIALLY_FILLED, "ISIN_2", 100);
        Order order2_cancelled = new Order(2, Order.Status.CANCELLED, "ISIN_2", 10);

        algo.process(order1_new);
        algo.process(order1_partialFilled);
        algo.process(order1_cancelled);

        algo.process(order2_new);
        algo.process(order2_partialFilled);
        algo.process(order2_cancelled);

        executor.shutdown();
    }
}