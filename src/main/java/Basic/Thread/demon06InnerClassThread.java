package Basic.Thread;

public class demon06InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
            //重写run方法
            @Override
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+"线程");
                }
            }
        }.start();

        //线程的接口Runnable
        //Runnable r = new RunnableImpl();   多态
        Runnable r = new Runnable(){
            //重写run方法
            @Override
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+"多线程");
                }
            }
        };
        new Thread(r).start();

        //简化
        new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"-->"+"简化多线程创建");
                }
            }
        }).start();

    }
}

