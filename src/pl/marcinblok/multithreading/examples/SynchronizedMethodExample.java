package pl.marcinblok.multithreading.examples;

import pl.marcinblok.multithreading.classes.SynchronizedMethod;
import pl.marcinblok.multithreading.classes.SynchronizedThread;

public class SynchronizedMethodExample {
    public static void main(String[] args) {

        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();
        SynchronizedThread reader1 = new SynchronizedThread(synchronizedMethod, "Reader1");
        SynchronizedThread reader2 = new SynchronizedThread(synchronizedMethod, "Reader2");

    }
}
