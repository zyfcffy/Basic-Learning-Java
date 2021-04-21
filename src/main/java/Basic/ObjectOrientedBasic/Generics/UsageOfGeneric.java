package Basic.ObjectOrientedBasic.Generics;

import java.util.Arrays;

/*
 * 泛型用法
 * 泛型接口(example Arrays.sort(Object[])可以对任意数组进行排序，但待排序的元素必须implements Comparable<T>这个泛型接口 )
 * */
public class UsageOfGeneric {
    public static void main(String[] args) {
        Person[] ps = new Person[]{
                new Person("Bob", 20),
                new Person("Lily",22),
                new Person("Alice",19),
                new Person("Eden",18)
        };
        Arrays.sort(ps); // 不实现：java.lang.ClassCastException: Basic.ObjectOrientedBasic.Generics.Person cannot be cast to java.lang.Comparable
        System.out.println(Arrays.toString(ps));
    }
}

/*
 * 想实现直接使用sort()对Person进行排序，按年龄升序
 * 1、实现Comparable<T>接口
 * 2、重写compareTo()方法
 * */
class Person implements Comparable<Person> {
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
