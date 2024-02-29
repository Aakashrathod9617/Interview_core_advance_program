package com.rays.mythread;

class SharedResource {
    // Some shared resource or data
}

class MyThread extends Thread {
    private SharedResource sharedResource;

    public MyThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        synchronized (sharedResource) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting");
                sharedResource.wait(); // The thread will wait until notify() is called
                System.out.println(Thread.currentThread().getName() + " has been notified");
                // Perform some action after being notified
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}               

public class WaitMethod {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        MyThread thread1 = new MyThread(sharedResource);
        MyThread thread2 = new MyThread(sharedResource);
        MyThread thread3 = new MyThread(sharedResource);
        

        thread1.start();
        thread2.start();

        // Some time later, another thread can notify one of the waiting threads
        synchronized (sharedResource) {
           // sharedResource.notify(); // Notify one waiting thread
              sharedResource.notifyAll(); // Notify all waiting threads
        }
    }
}