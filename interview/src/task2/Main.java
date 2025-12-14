package task2;

/**
 * Design and implement a thread-safe Publisher/Subscriber (pub/sub) mechanism.
 * <p>
 * Duration 15 minutes.
 */
public class Main {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber(); //single subscriber

        Publisher publisher1 = new Publisher();
        Publisher publisher2 = new Publisher();

        //Thread 1:
        publisher1.publish(new Event(1));
        publisher1.publish(new Event(2));
        publisher1.publish(new Event(3));

        //thread 2:
        publisher2.publish(new Event(4));
        publisher2.publish(new Event(5));
        publisher2.publish(new Event(6));

    }
}