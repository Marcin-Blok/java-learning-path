package pl.marcinblok.multithreading.examples;

import pl.marcinblok.multithreading.classes.MyThread;
import pl.marcinblok.multithreading.classes.MyThreadExtendsThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {
    public static void main(String[] args) {

        // Pierwszy sposób tworzenia wątków, poprzez implementację interfejsu Runnable
        Thread thread1 = new Thread(new Runnable() {
            // W metodzie run(), umieszczam kod który ma być uruchomiony w osobnym wątku
            @Override
            public void run() {
                for (int i = 0; i < 55; i++) {
                    System.out.println(Thread.currentThread() + " " + i);
                }
            }
        });

//        // Tworzenie wątku z wykorzystaniem lambdy
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread() + " " + i);
            }

        });

        thread1.setName("Wątek pierwszy");
        thread2.setName("Wątek drugi");
        thread1.start();
        thread2.start();
        /*
         * run(); i start(); - różnice
         * Metoda run() uruchamia zadanie w wątku głównym, natomiast metoda start() uruchamia zadanie w nowym, osobnym wątku.
         */

        System.out.println();


        /*-------Wyścig wątków głównego i potomnego--------------------------------------------------*/

        Thread mainThread = Thread.currentThread();
        mainThread.setName("Wątek główny");

        MyThread newThread = new MyThread();
        newThread.thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(mainThread.getName() + " " + i);
            try {
                mainThread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /*--------------------------------------------------------------------------------------------------------------------------*/
        // Drugi sposób tworzenia wątków, poprzez rozszerzanie klasy Thread

        MyThreadExtendsThread myThreadExtendsThread = new MyThreadExtendsThread("Nowy wątek");
        myThreadExtendsThread.start();




        /*--------------------------------------------------------------------------------------------------------------------------*/

        // Trzeci sposób tworzenia wątków poprzez utworzenie puli wątków - sposób zalecany
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(ThreadExample::numbers);
        executorService.submit(ThreadExample::numbers);
        executorService.shutdown();
        /* Metody shutdown() i shutdownNow() - różnice.
        shutdownNow() - stara się zamknąć/ubić wątek bez czekania na zakończenie
        shutdown() - zamyka pulę ale dopiero po zakończeniu wszystkich wykonywanych wątków
         */


    }

    public static void numbers() {
        for (int i = 0; i < 55; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
