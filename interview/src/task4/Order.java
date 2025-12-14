package task4;

public record Order(int id, Status status, String isin, int delayMs) {

    public enum Status {
        NEW,
        PARTIALLY_FILLED,
        CANCELLED,
    }
}
