package com.company;

public class RunThreads {
    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }

    public void runBasic() {
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start();

        ThreadSample thread = new ThreadSample();
        thread.start();
        System.out.println("RunThreads.runBasic() method is ended.");
    }

    public static class RunnableSample implements Runnable {
        @Override
        public void run() {
            System.out.println("This is RunnableSample's run() method.");
        }
    }

    public static class ThreadSample extends Thread {
        @Override
        public void run() {
            System.out.println("This is ThreadSample's run() method.");
        }
    }
}
