package Basic.ObjectOrientedBasic.Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 访问字段
* Field getField(name)：根据字段名获取某个public的field（包括父类）
* Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
* 访问方法
* Method getMethod(name, Class...)：获取某个public的Method（包括父类）
* Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
* 构造方法，当前定义类的构造方法，与父类无关
* getConstructor(Class...)：获取某个public的Constructor；
* getDeclaredConstructor(Class...)：获取某个Constructor；
* getConstructors()：获取所有public的Constructor；
* getDeclaredConstructors()：获取所有Constructor。
* */
public class ClassFieldAndMethod {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<Student> sc = Student.class;
        // name 和 score 是 private ，本类的 score 用 getDeclaredField 会将所有的字段都返回
        // 父类的字段是private的,子类无法获取父类私有实例
        // System.out.println(sc.getDeclaredField("name")); //Field 'name' is not declared in class 'Basic.ObjectOrientedBasic.Reflection.Student'
        // 要通过反射拿到父类的私有属性和方法，要使用getSuperClass()
        System.out.println(sc.getSuperclass().getDeclaredField("name"));
        System.out.println(sc.getDeclaredField("score"));
        System.out.println(sc.getField("clazz"));

        System.out.println(sc.getMethod("getClazz"));
        System.out.println(sc.getDeclaredMethod("getScore"));


        // 用反射来调用方法，用invoke方法
        /*
        * String s = "hello tw";
        * String r = s.subString(6);  // tw
        * task：
        * 1、获取方法实例 getMethod()
        * 2、实例调用方法 Method 的 invoke 方法
        */
        String s = "hello tw";
        Method m  = String.class.getMethod("substring", int.class);
        String result = (String) m.invoke(s, 6);
        System.out.println(result);

        // 调用非Public方法, setAccessible(true)，没有的话，会报 java.lang.NoSuchMethodException
        Student student = new Student();
        Method method1 = student.getClass().getDeclaredMethod("setScore", int.class);
        Method method2 = student.getClass().getDeclaredMethod("getScore");
        method1.setAccessible(true);
        method2.setAccessible(true);
        method1.invoke(student, 90);
        //System.out.println(student.score);
        Object o = method2.invoke(student);
        System.out.println(o.toString());

        // 多态
        /*
        * Person p = new Student();
        * p.hello();  // 调用的是子类覆写的方法
        * */
        Method method = student.getClass().getMethod("hello");
        method.invoke(student);  //Student say hello
        Method method3 = Person.class.getMethod("hello");
        method3.invoke(new Student()); //Student say hello


        // 调用构造方法  可以用Class提供的 newInstance 方法
        //Student st = new Student()
        Constructor<Student> con = Student.class.getConstructor();
        Student st = con.newInstance();
        System.out.println("Student clazz is :" + st.getClazz());
    }
}
class Person {
    private String name;
    public void hello(){
        System.out.println("Person say hello");
    }
}

class Student extends Person {
    int score;
    public int clazz;

    public Student(){}

    private void setScore(int score){
        this.score = score;
    }

    private int getScore(){
        return this.score;
    }

    public int getClazz(){
        return 2;
    }

    @Override
    public void hello() {
        System.out.println("Student say hello");
    }
}