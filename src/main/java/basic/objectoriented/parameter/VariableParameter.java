package basic.objectoriented.parameter;

import basic.objectoriented.parameter.pojo.Group;

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
