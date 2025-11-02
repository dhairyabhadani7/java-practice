package JavaPractice;

class MyLifeCycleThread extends Thread{
    public void run(){
         System.out.println(getName() + " is running...");
        try {
            Thread.sleep(1000); // Moves to "Timed Waiting"
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " has finished execution.");
    }
}

public class ThreadLifeCycleExample {
    public static void main(String[] args) throws InterruptedException{
        MyLifeCycleThread t1 = new MyLifeCycleThread();
        System.out.println("Thread state after creation:"+t1.getState()); //NEW

        t1.start();
        System.out.println("Thread state after start(): " + t1.getState()); // RUNNABLE

        Thread.sleep(100); // small delay
        System.out.println("Thread state while running: " + t1.getState()); // RUNNABLE or TIMED_WAITING

        t1.join(); // wait for it to finish
        System.out.println("Thread state after completion: " + t1.getState()); // TERMINATED

    }
}
