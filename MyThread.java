public class MyThread  extends Thread {
    public volatile boolean running = true;
    public void run() {
        System.out.println("Hello! If you want to stop thread press enter!");
        while (running) {
            System.out.println("Thread running!");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void stopThread() {
        this.running = false;
        System.out.println("Thread stopped!");
    }
}
