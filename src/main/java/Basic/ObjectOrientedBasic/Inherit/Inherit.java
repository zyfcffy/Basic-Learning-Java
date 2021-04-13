package Basic.ObjectOrientedBasic.Inherit;

public class Inherit {

    public static void main(String[] args) {
        // 向上转型
        Student xiaoming = new Student("xiaoming", 12, 90);
        Person p = xiaoming;
        System.out.println(xiaoming.getScore()); //90
        //没有 getScore 方法
        Person xiaohong = new Student("xiaohong", 18, 99);
        System.out.println(xiaohong.getName());
        System.out.println(xiaohong.getAge());

        //向下转型，强转
        Person xiaoxu = new Person("xiaoxu", 20);
        //Student s = (Student) xiaoxu;  //java.lang.ClassCastException,xiaoxu的指向的是Person实例，不能将父类变成子类，子类的功能本来就比父多，多的功能无法凭空变出来
        Person xiaozhang = new Student("xiaozhang", 21, 100);
        Student s = (Student) xiaozhang;
        System.out.println(s.getName());
        System.out.println(s.getScore());

        //可以使用 instanceof 来判断是不是某种类型的实例
        System.out.println(xiaoxu instanceof Student);  //false
        //向下转型前可以判断变量是否指向的实例是指定的类型，或者是这个类型的子类，再进行转型
        Person p1 = new Student("s", 18, 90);
        if (p1 instanceof Student){
            Student student = (Student) p1;
        }
        //Java 14 之后，判断instance of之后，可以直接转型为指定变量
//        Object obj = "hello";
//        if (obj instanceof String ss) {
//            // 直接使用变量 s
//            System.out.println(ss.toUpperCase());
//        }
    }

}
