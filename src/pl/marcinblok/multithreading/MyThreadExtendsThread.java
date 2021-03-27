package pl.marcinblok.multithreading;

public class MyThreadExtendsThread extends Thread{

    public MyThreadExtendsThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " " + i);
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Zakończenie wątku potomnego");
    }
}
