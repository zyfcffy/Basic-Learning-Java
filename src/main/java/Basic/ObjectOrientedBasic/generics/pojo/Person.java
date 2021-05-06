package Basic.ObjectOrientedBasic.generics.pojo;


/*
 * 想实现直接使用sort()对Person进行排序，按年龄升序
 * 1、实现Comparable<T>接口
 * 2、重写compareTo()方法
 * */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "," + this.age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age > o.age) return 1;
        else if (this.age < o.age) return -1;
        return 0;
    }
}
