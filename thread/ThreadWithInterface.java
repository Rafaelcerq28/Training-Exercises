package thread;

public class ThreadWithInterface implements Runnable{
    
    //Example of thread class implmenting the interface Runnable
    String threadName;
    int time;

    public ThreadWithInterface(String threadName, int time) {
        this.threadName = threadName;
        this.time = time;
        //When implementing the interface we have to instanciate a Thread object and call the method start  
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
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
