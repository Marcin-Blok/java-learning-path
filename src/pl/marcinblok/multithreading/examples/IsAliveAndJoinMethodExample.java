package pl.marcinblok.multithreading.examples;


import pl.marcinblok.multithreading.classes.MyThread;

public class IsAliveAndJoinMethodExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.thread.start();

        // Wyświetlaj info dopóki wątek potomny isAlive() == true.
//        do {
//            System.out.println(myThread.thread.getName() + " uruchomiony");
//        } while (myThread.thread.isAlive());


        // Czekaj aż wątek potomny się zakończy
        try {
            myThread.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Przerwanie wątku potomnego");
        }

        System.out.println("Koniec wątku głównego");

    }
}
