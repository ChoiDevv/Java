package Java.Thread;

import java.util.ArrayList;

public class Test3 implements Runnable {

    int seq;

    public Test3(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq + " Java.Thread Start");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println(this.seq + " Java.Thread End");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Test3(i));
            t.start();
            threads.add(t);
        }

        for (int i = 0; i < 10; i++) {
            Thread t = threads.get(i);
            try {
                t.join();
            } catch (Exception e) {

            }
        }
        System.out.println("main End");
    }
}
