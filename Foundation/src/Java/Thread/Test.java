package Java.Thread;

public class Test extends Thread {

    int seq;

    public Test(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " Java.Thread Start");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println(this.seq + " Java.Thread End");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Test(i);
            t.start();
        }
        System.out.println("main end");
    }
}
