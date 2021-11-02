package basic.thread.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demon05Runnable {
    public static void main(String[] args) {
        //3、创建一个Runnable接口的实现类对象
        RunnableImpl task = new RunnableImpl();
        //4、创建Thread类对象，构造方法中传递Runnable接口的实现对象
//        Thread thread = new Thread(run);//Thread(Runnable target)分配新的 Thread 对象,必须有参数
//        //5、调用Thread的start方法，开启新的线程执行run方法
//        thread.start();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + "=====>" + i);
//        }

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
    }
}

