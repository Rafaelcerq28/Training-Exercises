package thread;

public class Test {
    public static void main(String[] args) {
    
        //Terting with thread extending the class
        ThreadTest th = new ThreadTest("Thread 1", 0);
        ThreadTest th2 = new ThreadTest("Thread 2", 0);
    
        //testing the class implementing the interface
        ThreadWithInterface thInterface1 = new ThreadWithInterface("Thread with Interface 1", 0);
        ThreadWithInterface thInterface2 = new ThreadWithInterface("Thread with Interface 2", 0);
    }
}
