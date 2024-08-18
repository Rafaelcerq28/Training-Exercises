package thread;

public class ThreadTest extends Thread {

//Example of thread extending Thread class
    String threadName;
    int time;

    public ThreadTest(String threadName, int time) {
        this.threadName = threadName;
        this.time = time;
        //calling the start method in the constructor, so it can start the run() method
        start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " counter " + i);

                Thread.sleep(time);

            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
