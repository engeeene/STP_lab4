
package lab3;

public class Metrics {
    //private static long timeUsed = 0;
    //private static long memoryUsed = 0;

    public Metrics() {}

    private long timeStart = 0;
    private long memoryStart = 0;
    private long timeEnd = 0;
    private long memoryEnd = 0;

    public void start() {
        timeStart = System.nanoTime();
        memoryStart = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    }

    public void stop() {
        timeEnd = System.nanoTime();
        memoryEnd = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    }

    public long getTime() {
        return timeEnd - timeStart;
    }

    public long getMemory() {
        return memoryEnd - memoryStart;
    }

    public long getMemoryStart() {
        return memoryStart;
    }

    public long getMemoryEnd() {
        return memoryEnd;
    }
}
