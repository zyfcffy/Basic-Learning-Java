package basic.collections.pojo;

public class Person {
  public String name;
  public int score;

  public Person(String name, int score){
    this.name = name;
    this.score = score;
  }

  public String toString() {
    return String.format("{%s: score=%d}", name, score);
  }
}
