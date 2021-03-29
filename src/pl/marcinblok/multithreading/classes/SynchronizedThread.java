package pl.marcinblok.multithreading.classes;

public class SynchronizedThread implements Runnable{

    String name;
    SynchronizedMethod s1;
    Thread t;

    public SynchronizedThread(SynchronizedMethod s1, String name){
        this.s1 = s1;
        t = new Thread(this,name);
        t.start();
    }

    @Override
    public void run() {
        try {
            s1.reading();
        } catch (InterruptedException e) {
            System.out.println("Thread was interupted");
        }
    }
}
