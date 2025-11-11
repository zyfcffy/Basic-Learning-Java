package basic.rdd;
/*
* Map类, .map方法, .flatmap方法
* */
public class Map {

  public static void main(String[] args) {
    // .map方法
    // 功能: 对RDD中的每个元素应用一个函数, 并返回一个新的RDD, 该RDD包含应用函数后的结果
    // 示例: 将一个整数RDD中的每个元素乘以2
    /*
    JavaRDD<Integer> rdd = sc.parallelize(Arrays.asList(1, 2, 3, 4, 5));
    JavaRDD<Integer> mappedRdd = rdd.map(x -> x * 2);
    mappedRdd.collect(); // 结果: [2, 4, 6, 8, 10]
    */

    // .flatMap方法
    // 功能: 对RDD中的每个元素应用一个函数, 并返回一个新的RDD, 该RDD包含应用函数后展开的结果
    // 示例: 将一个字符串RDD中的每个字符串拆分成单词
    /*
    JavaRDD<String> rdd = sc.parallelize(Arrays.asList("hello world", "apache spark"));
    JavaRDD<String> flatMappedRdd = rdd.flatMap(line -> Arrays.asList(line.split(" ")).iterator());
    flatMappedRdd.collect(); // 结果: ["hello", "world", "apache", "spark"]
    */
  }
}
