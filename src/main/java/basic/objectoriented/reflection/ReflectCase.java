package basic.objectoriented.reflection;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 需求：写一个“框架”，在不改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
 * 实现：
 * 1、配置文件
 * 2、反射
 * 步骤：
 * 1、将需要创建的对象的全类名和需要执行的方法定义到配置文件中
 * 2、在程序中加载读取配置文件
 * 3、使用反射技术来加载类文件进内存
 * 4、创建对象
 * 5、执行方法
 * */
public class ReflectCase {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1、创建 Properties 对象
        Properties properties = new Properties();
        //2、加载配置文件
        ClassLoader classLoader = ReflectCase.class.getClassLoader();
        InputStream resource = classLoader.getResourceAsStream("pro.properties");
        properties.load(resource);
        //3、获取配置文件中类名和方法名
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        //4、加载
        Class<?> cls = Class.forName(className);
        //5、创建对象
        Object o = cls.newInstance();
        //6、获取方法
        Method method = cls.getMethod(methodName);
        //7、执行方法
        method.invoke(o);
    }

}
