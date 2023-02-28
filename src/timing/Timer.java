package timing;

public class Timer implements ITimer{

    private long startTime;
    private long totalTime;

    @Override
    public void start() {
        startTime = System.nanoTime();
        totalTime = 0;
    }

    @Override
    public long stop() {
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime-startTime;
        totalTime += elapsedTime;
        return totalTime;
    }

    @Override
    public void resume() {
        startTime = System.nanoTime() - totalTime;
    }

    @Override
    public long pause() {
        long pauseTime = System.nanoTime();
        return pauseTime - startTime;
    }
}
