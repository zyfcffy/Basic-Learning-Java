package basic.thread.demo;

//1、创建一个Thread类的子类
public class myThread01 extends Thread {
    //2、在Thread类的子类中重写Thread类中的run方法，设置线程任务
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + i);
        }
    }
}
