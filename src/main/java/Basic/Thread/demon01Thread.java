package Basic.Thread;

public class demon01Thread {
    //3、创建Thread类的子类对象
    public static void main(String[] args) {
        myThread01 mt = new myThread01();
        //4、调用Thread类中的start方法，开启新的线程，执行run方法
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }
}
