package basic.thread.modle;

/*
* new thread by extend Thread
* */
public class Thread1 extends Thread {
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread1 run......" + i);
      try {
        Thread.sleep(2);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }
}
