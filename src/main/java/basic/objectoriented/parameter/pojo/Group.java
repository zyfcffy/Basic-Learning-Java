package basic.objectoriented.parameter.pojo;

import java.util.Arrays;

public class Group{
    // ...代表可变参数
    public void setNamesWithVP(String... names){
        System.out.println(Arrays.toString(names));
    }

    public void setNamesWithNP(String[] names){
        System.out.println(Arrays.toString(names));
    }
}
