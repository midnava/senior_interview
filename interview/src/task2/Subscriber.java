package task2;

public class Subscriber {

    private void onMessage(Event message) {
        System.out.println("Received: " + message);
    }
}
