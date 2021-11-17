package basic.thread.lifecycle;

import basic.thread.modle.BlockedThread;

public class BlockedState {
  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new BlockedThread());
    Thread t2 = new Thread(new BlockedThread());

    t1.start();
    t2.start();

    System.out.println(t1.getState());  // RUNNABLE
    System.out.println(t2.getState());  // BLOCKED

    System.exit(0);
  }
}
