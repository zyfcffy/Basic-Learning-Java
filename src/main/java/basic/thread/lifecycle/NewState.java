package basic.thread.lifecycle;


public class NewState implements Runnable{
  @Override
  public void run() {
    System.out.println("this is a new thread");
  }


  public static void main(String[] args) throws InterruptedException {
    Runnable runnable = new NewState();
    Thread t = new Thread(runnable);

    System.out.println(t.getState());  // NEW

    t.start();

    System.out.println(t.getState());  // RUNNABLE

    Thread.sleep(1000);

    System.out.println(t.getState()); // TERMINATED
  }

}
