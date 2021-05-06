package Basic.ObjectOrientedBasic.reflection.pojo;

public class Student extends Person {
    int score;
    public int clazz;

    public Student(){}

    private void setScore(int score){
        this.score = score;
    }

    private int getScore(){
        return this.score;
    }

    public int getClazz(){
        return 2;
    }

    @Override
    public void hello() {
        System.out.println("Student say hello");
    }
}
