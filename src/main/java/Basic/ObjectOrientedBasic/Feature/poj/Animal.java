package Basic.ObjectOrientedBasic.feature.poj;

public class Animal {
    private String name;
    private int age;
    public static String type;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 静态方法属于class，而不属于实例，因此

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
