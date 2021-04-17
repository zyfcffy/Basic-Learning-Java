package Basic.ObjectOrientedBasic.CoreClass;

/*
 * Enum 类
 * */
public class EnumClass {
    public static void main(String[] args) {
        Week day = Week.SAT;
        System.out.println(day);      // 打印的是toString()
        System.out.println(Week.SAT); // 打印的是toString()
// enum class 可以用 == 来比较，因为
//        if(day == Week.SAT || day == Week.SUN){
//            System.out.println("it's weekend~~");
//        }else {
//            System.out.println("it's time to move bricks!");
//        }

        //ordinal 的顺序是按照排列方式变的，所以枚举常量和int之间转换，不推荐使用 ordinal
        //enum 是class，所以可以定义构造方法，给每个常量增加字段
        System.out.println(Week.MON.ordinal());
        // name() 和 toString() 方法返回的值是一样的，但是 toString() 方法可以覆写，name()不可以，判断枚举产量的名字时，只能用name()
        System.out.println(day.name());
        System.out.println(day.toString());


    }
}

enum Week {
    SUN(0, "星期天"),
    MON(1, "星期一"),
    TUE(2, "星期二"),
    WEN(3, "星期三"),
    THU(4, "星期四"),
    FRI(5, "星期五"),
    SAT(6, "星期六");

    private final int value;
    private final String name;

    Week(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

