package task1;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Refactor this class to be truly immutable.
 * <p>
 * Duration 5 minutes.
 */
public class ImmutableRecord {
    public String id;
    public AtomicInteger atomicInteger;
    public List<Date> dateList;
}