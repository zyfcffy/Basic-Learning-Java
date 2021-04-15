package Basic.ObjectOrientedBasic.Feature;
/*
* 静态方法和静态字段
* */
public class Static {
    public static void main(String[] args) {
        Animal dog = new Animal("dog", 15);
        Animal cat = new Animal("cat", 10);
        //dog 和 cat 都能调用和修改 type 的值
        dog.type = "jjj";
        System.out.println(dog.type);  // jjj
        cat.type = "lll";
        System.out.println(dog.type);  //lll
        System.out.println(cat.type);
        // 虽然实例可以访问 type 字段，但是都是指向 Animal class 的静态字段，所有实例共享静态字段
        // 推荐使用类名来访问静态字段
        Animal.type = "xxx";
    }
}

class Animal {
    private String name;
    private int age;
    public static String type;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 静态方法属于class，而不属于实例，因此
    public static void setType(String value){
        type = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
