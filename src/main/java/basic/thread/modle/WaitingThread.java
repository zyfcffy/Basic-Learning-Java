package basic.thread.modle;

import basic.thread.lifecycle.WaitingState;

// sleep
public class WaitingThread implements Runnable {

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // 在t2 join之后，t1的状态会变为 waiting 状态
    System.out.println("join后t1的状态:" + WaitingState.t1.getState());
  }
}
