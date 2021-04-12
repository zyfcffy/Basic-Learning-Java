package Basic.ObjectOrientedBasic.Parameter;

import java.util.Arrays;

//方法中的参数
public class VariableParameter {
    public static void main(String[] args) {
        Group group = new Group();
        group.setNamesWithVP("xiaoming");
        group.setNamesWithVP("dahua", "xiaofang");
        group.setNamesWithVP("dahuang", "xiaoqin", "xiaoxue");
        // 传入 0 个String，返回一个空数组，不会有null存在
        group.setNamesWithVP();

        group.setNamesWithNP(new String[]{"xiaoming","dahua"});
        // 可以传入 null， 返回就是一个 null
        group.setNamesWithNP(null);
    }

}

class Group{
    // ...代表可变参数
    public void setNamesWithVP(String... names){
        System.out.println(Arrays.toString(names));
    }

    public void setNamesWithNP(String[] names){
        System.out.println(Arrays.toString(names));
    }
}
