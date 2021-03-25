package pl.marcinblok.multithreading;

public class ThreadExample {
    public static void main(String[] args) {

        // Pierwszy sposób - niezalecany
        Thread thread1 = new Thread(new Runnable() {
            // W metodzie run(), umieszczam kod który ma być uruchomiony w osobnym wątku
            @Override
            public void run() {
                for (int i = 0; i < 55; i++) {
                    System.out.println(Thread.currentThread() + " " + i);
                }
            }
        });

        // Tworzenie wątku z wykorzystaniem lambdy
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
         * t1.run(); i t1.start(); - różnice
         * Metoda run() uruchamia zadanie w wątku głównym, natomiast metoda start() uruchamia zadanie w nowym, osobnym wątku.
         */

    }
}
