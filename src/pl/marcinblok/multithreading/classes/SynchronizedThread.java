package pl.marcinblok.multithreading.classes;

public class SynchronizedThread implements Runnable{

    String name;
    SynchronizedMethod s1;
    public Thread t;

    public SynchronizedThread(SynchronizedMethod s1, String name){
        this.s1 = s1;
        t = new Thread(this,name);
        t.start();
    }




//    public void run() {
//        try {
//            s1.reading();
//        } catch (InterruptedException e) {
//            System.out.println("Thread was interupted");
//        }
//    }

    // Przykład z wykorzystaniem bloku synchronized
    public void run() {
        synchronized (s1){
            System.out.print(t.getName() + " ");
            try {
                s1.reading();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
