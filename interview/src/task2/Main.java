package task2;

/**
 * Design and implement a thread-safe Publisher/Subscriber (pub/sub) mechanism.
 * <p>
 * Duration 10 minutes.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Subscriber subscriber = new Subscriber(); //single subscriber

        Publisher publisher1 = new Publisher();
        Publisher publisher2 = new Publisher();

        //Thread 1:
        publisher1.publish(new Event(1));
        Thread.sleep(500);
        publisher1.publish(new Event(2));
        Thread.sleep(500);
        publisher1.publish(new Event(3));
        Thread.sleep(500);

        //thread 2:
        publisher2.publish(new Event(4));
        Thread.sleep(500);
        publisher2.publish(new Event(5));
        Thread.sleep(500);
        publisher2.publish(new Event(6));
        Thread.sleep(500);

    }
}