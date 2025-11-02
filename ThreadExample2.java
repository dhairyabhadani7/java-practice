package JavaPractice;

class MyRunnable implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" is running.."+i);
        }
        try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
    }
}
}
public class ThreadExample2 {
    public static void main(String[] args) {
        
       MyRunnable task = new MyRunnable();

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();

        System.out.println("Main thread ends...");

    }
}
