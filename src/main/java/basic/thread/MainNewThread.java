package basic.thread;

import basic.thread.modle.Thread1;
import basic.thread.modle.Thread2;

public class MainNewThread {
  public static void main(String[] args) throws InterruptedException {
    new Thread1().start();
    new Thread2().start();

    for (int i = 0; i < 100; i++) {
      System.out.println("Main run...." + i);
      Thread.sleep(2);
    }

    /*
    * new thread by lambda
    * */

//    Thread t = new Thread(() -> {
//      System.out.println("new a thread");
//    });
//    t.start();
  }
}
