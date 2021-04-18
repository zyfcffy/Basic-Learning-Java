package Basic.ObjectOrientedBasic.Reflection;

/*
* 访问字段
* Field getField(name)：根据字段名获取某个public的field（包括父类）
* Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
* Field[] getFields()：获取所有public的field（包括父类）
* Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
* */
public class ClassField {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student> sc = Student.class;
        // name 和 score 是 private ，本类的 score 用 getDeclaredField 会将所有的字段都返回
        // 父类的字段是private的，没有set/get方法，子类无法使用
        //System.out.println(sc.getDeclaredField("name")); //Field 'name' is not declared in class 'Basic.ObjectOrientedBasic.Reflection.Student'
        // 要通过反射拿到父类的私有属性和方法，要使用getSuperClass()
        System.out.println(sc.getSuperclass().getDeclaredField("name"));
        System.out.println(sc.getDeclaredField("score"));
        System.out.println(sc.getField("clazz"));
    }
}
class Person {
    private String name;
}

class Student extends Person {
    private int score;
    public int clazz;
}