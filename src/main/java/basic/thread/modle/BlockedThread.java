package basic.thread.modle;

public class BlockedThread implements Runnable{

  @Override
  public void run() {
    block();
  }

  private static synchronized void block() {
    while (true){
      // 无线循环，一个线程start了就不会离开，第二个线程调用的时候，会block住
    }
  }
}
