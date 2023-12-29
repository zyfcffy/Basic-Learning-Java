package basic.thread.demo;

public class demon02MutiThread {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread(() -> {
            System.out.println("thread run...");
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {}
            System.out.println("thread end.");
        });
        t.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {}
        System.out.println("main end...");
    }

//    main start...
//    thread run...
//    main end...
//    thread end.

}
