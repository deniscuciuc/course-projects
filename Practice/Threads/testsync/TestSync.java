package testsync;

public class TestSync {
    public static void main(String[] args) {
        TestSyncTest job = new TestSyncTest();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.start();
        b.start();
    }
}
