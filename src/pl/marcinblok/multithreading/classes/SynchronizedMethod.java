package pl.marcinblok.multithreading.classes;

public class SynchronizedMethod {

    synchronized void reading() throws InterruptedException {
        System.out.println("I'm reading a book");
        try {
            Thread.sleep(1500);
        }catch (InterruptedException e){
            System.out.println("Reading interupted");
        }
        System.out.println("I have read a book ");
    }
}
