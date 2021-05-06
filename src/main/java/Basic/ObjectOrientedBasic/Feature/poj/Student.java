package Basic.ObjectOrientedBasic.feature.poj;

import Basic.ObjectOrientedBasic.feature.poj.Person;

public class Student extends Person {
    private int score;

    public Student() {
    }

    public Student(int score) {
        super();
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void work() {
        System.out.println("上学");
    }
}