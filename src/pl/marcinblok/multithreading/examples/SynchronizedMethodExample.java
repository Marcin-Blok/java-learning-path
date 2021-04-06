package pl.marcinblok.multithreading.examples;

import pl.marcinblok.multithreading.classes.SynchronizedMethod;
import pl.marcinblok.multithreading.classes.SynchronizedThread;

public class SynchronizedMethodExample {
    public static void main(String[] args) throws InterruptedException {

        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();
        SynchronizedThread reader1 = new SynchronizedThread(synchronizedMethod, "Reader1");
        SynchronizedThread reader2 = new SynchronizedThread(synchronizedMethod, "Reader2");
        reader1.t.join();
        reader2.t.join();

        System.out.println("Zakończenie wątku głównego");
    }
}
