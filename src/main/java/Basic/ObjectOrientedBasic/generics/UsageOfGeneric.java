package Basic.ObjectOrientedBasic.generics;

import Basic.ObjectOrientedBasic.generics.pojo.Person;

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
