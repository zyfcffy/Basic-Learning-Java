package basic.collections;

import basic.collections.pojo.Person;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
* 使用TreeMap 放入的key必须实现Comparable接口
* sort() 方法进行排序的元素也必须实现Comparable接口
*  */
public class TreeMapComparable {
  public static void main(String[] args) {
    Map<Person, Integer> treeMap = new TreeMap<>(new Comparator<Person>() {
      public int compare(Person o1, Person o2) {
        if (o1.score == o2.score){
          return 0;
        }
        return o1.score > o2.score ? -1 : 1;
      }
    });
    treeMap.put(new Person("Tom", 90), 1);
    treeMap.put(new Person("Bob", 98), 2);
    treeMap.put(new Person("Lily", 91), 2);

    for (Person key : treeMap.keySet()){
      System.out.println(key.toString());
    }
  }
}
