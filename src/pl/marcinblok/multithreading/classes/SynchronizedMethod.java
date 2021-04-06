package pl.marcinblok.multithreading.classes;

import static java.lang.Thread.sleep;

public class SynchronizedMethod {

    synchronized void reading() throws InterruptedException {
        System.out.println("I'm reading a book");
        try {
            sleep(1500);
            System.out.println("I have read a book");
        } catch (InterruptedException e) {
            System.out.println("Reading interupted");
        }
    }

}
