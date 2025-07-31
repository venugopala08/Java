// Threads are smallest unit of processing that can be scheduled by an operating system.// They are used to perform multiple tasks concurrently within a single process.
// In Java, threads can be created by extending the Thread class or implementing the Runnable interface.
// while extending thread class. we have to create method called run() which contains the code to be executed by the thread.and then we can create an object of the class and call start() method to start the thread.
// while implementing runnable interface we have to implement run() method and then we can create an object of the class and pass it to a Thread object, then call start() method on that Thread object to start the thread.

/* 

// Example of creating a thread by extending the Thread class
class MyThread extends Thread {
    public void run(){
        for (int i = 0; i<50 ; i++)
            System.out.println("Thread 1: " + i);
    }
}

class MyThread2 extends Thread {
    public void run(){
        for (int i = 0; i<50 ; i++)
            System.out.println("Thread 2: " + i);
    }
}

public class Threads{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread2 thread2 = new MyThread2();

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}


*/


// Example of creating a thread by extending the Thread class and suing sleep and priority
// Note: The sleep method is used to pause the execution of the thread for a specified duration
/* 
class MyThread extends Thread {
    public void run(){
        for (int i = 0; i<50 ; i++)
            System.out.println("Thread 1: " + i);
            try{
                Thread.sleep(10); // Sleep for 10 milliseconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}

class MyThread2 extends Thread {
    public void run(){
        for (int i = 0; i<50 ; i++)
            System.out.println("Thread 2: " + i);
             try{
                Thread.sleep(10); // Sleep for 10 milliseconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}

public class Threads{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread2 thread2 = new MyThread2();

        thread1.start(); // Start the first thread
        // try {
        //     thread1.setPriority(Thread.MAX_PRIORITY); // Set the priority of the first thread to maximum
        // } catch (Exception e) {
        //     e.printStackTrace();}
        thread2.start(); // Start the second thread
    }
}

*/



// Example of creating a thread by implementing the Runnable interface
// Note: The Runnable interface is a functional interface that contains a single abstract method run()
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

public class Threads{
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



// Example of creating a thread by implementing the Runnable interface and using lambda expressions



public class Threads{
    public static void main(String[] args) {
        Runnable thread1 = () -> 
        { for (int i = 0; i<5 ; i++){
            System.out.println("Thread 2: " + i);
            try{
                Thread.sleep(10); // Sleep for 10 milliseconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }    
    }; 

        Runnable thread2 = () ->{
        for (int i = 0; i<5 ; i++){
            System.out.println("Thread 2: " + i);
            try{
                Thread.sleep(10); // Sleep for 10 milliseconds
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }    
    };

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start(); // Start the first thread
        t2.start(); // Start the second thread
    }
}