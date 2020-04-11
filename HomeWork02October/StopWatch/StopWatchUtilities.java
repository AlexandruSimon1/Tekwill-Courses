package TekwillCourses.HomeWork02October.StopWatch;

public class StopWatchUtilities {
    private long startTime;
    private long endTime;

    StopWatchUtilities() {
        startTime = System.currentTimeMillis();
    }

    public void setStartTime() {
        startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

}
