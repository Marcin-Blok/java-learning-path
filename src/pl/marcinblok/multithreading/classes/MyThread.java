package pl.marcinblok.multithreading.classes;

public class MyThread implements Runnable{

    public Thread thread;

    public MyThread() {
        thread = new Thread(this,"Wątek potomny");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(thread.getName() + " " + i);
            try {
                thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
