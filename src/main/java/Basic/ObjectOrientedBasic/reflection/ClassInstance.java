package Basic.ObjectOrientedBasic.reflection;

/*
* Class 实例
* */
public class ClassInstance {
    public static void main(String[] args) throws ClassNotFoundException {
// 获取一个class的Class实例
        String s1 = "class~";
        //1 通过class的静态变量class获取
        //Class c1 = String.class;  //Raw use of parameterized class 'Class'
        Class<String> c1 = String.class;
        //2 通过实例的 getClass() 方法获取
        Class c2 = s1.getClass();
        //3 通过完整的完整类名获取
        Object c3 = Class.forName("java.lang.String");
        System.out.println(c1);
        System.out.println(c2);
        // Class实例在JVM中是唯一的，所以两种方法获取是同一个实例
        System.out.println(c1 == c2); // always true

        printClassInfo(String[].class);  // Class name:[Ljava.lang.String
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(int.class);
    }

    public static void printClassInfo(Class<?> cla){
        System.out.println("Class name:" + cla.getName());
        System.out.println("Simple name: " + cla.getSimpleName());
        System.out.println("Package name: " + cla.getPackage());
        System.out.println("Is interface name ? " + cla.isInterface());
        System.out.println("Is Array ? "+ cla.isArray());
    }

}
