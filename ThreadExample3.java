package JavaPractice;

public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable task1=()->{
               for(int i=1;i<=5;i++){
                 System.out.println(Thread.currentThread().getName() + " - Task 1 Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable task2=()->{
               for(int i=1;i<=5;i++){
                 System.out.println(Thread.currentThread().getName() + " - Task 2 Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task1,"Thread-A");
        Thread t2 = new Thread(task2,"Thread-B");
        t1.start();
        t2.start();

        System.out.println("Main thread ends...");
    }
}

