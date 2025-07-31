
class Counter{
    int count;
    public synchronized void increment(){  // it makes sure that only one thread can execute this method at a time
        count++;
    }
}


public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable thread1 = () -> 
        { for (int i = 0; i<1000 ; i++){
            c.increment();             
            }
        }; 

        Runnable thread2 = () ->{
        for (int i = 0; i<1000 ; i++){
            c.increment();            
            }
        };

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start(); // Start the first thread
        t2.start(); // Start the second thread

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}