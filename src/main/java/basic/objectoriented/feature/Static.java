package basic.objectoriented.feature;

import basic.objectoriented.feature.poj.Animal;

/*
* 静态方法和静态字段
* */
public class Static {
    public static void main(String[] args) {
        Animal dog = new Animal("dog", 15);
        Animal cat = new Animal("cat", 10);
        //dog 和 cat 都能调用和修改 type 的值
        Animal.type = "jjj";
        System.out.println(dog.type);  // jjj
        Animal.type = "lll";
        System.out.println(dog.type);  //lll
        System.out.println(cat.type);
        // 虽然实例可以访问 type 字段，但是都是指向 Animal class 的静态字段，所有实例共享静态字段
        // 推荐使用类名来访问静态字段
        Animal.type = "xxx";

        //Animal.setType(",,,");
    }
}
