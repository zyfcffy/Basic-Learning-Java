package basic.collections;

import java.util.Map;

/*
* HashMap 内部的key是无序的
* TreeMap : 接口是SortedMap，遍历key的顺序 String 默认字母排序
*
* */
public class TreeMapBasic {
  public static void main(String[] args) {
    Map<String, Integer> treeMap = new java.util.TreeMap<>();
    treeMap.put("orange", 1);
    treeMap.put("apple", 2);
    treeMap.put("grape", 3);

    // 遍历的顺序会是：apple, grape, orange
    for (String key: treeMap.keySet()){
      System.out.println(key);
    }
  }
}
