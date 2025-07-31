
/* 

class MyThread implements Runnable {
    public void run(){
        for (int i = 0; i<5 ; i++){
            System.out.println("Thread 1: " + i);
            try{
                Thread.sleep(10); // Sleep for 10 milliseconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }    
    }
}

class MyThread2 implements Runnable {
    public void run(){
        for (int i = 0; i<5 ; i++){
            System.out.println("Thread 2: " + i);
            try{
                Thread.sleep(10); // Sleep for 10 milliseconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }    
    }
}

public class Runnables{
    public static void main(String[] args) {
        Runnable thread1 = new MyThread();
        Runnable thread2 = new MyThread2();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start(); // Start the first thread
        t2.start(); // Start the second thread
    }
}

*/
