package basic.thread.modle;

public class Thread2 extends Thread {
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread2 run......" + i);
      try {
        Thread.sleep(2);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
