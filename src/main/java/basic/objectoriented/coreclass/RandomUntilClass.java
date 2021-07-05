package basic.objectoriented.coreclass;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/*
 * 常用工具类
 * Math
 * Random：伪随机数，要给定一个初始种子，会得到完全确定的随机数列
 * SecureRandom: 真随机数，不可预测的安全随机数，
 *
 * */
public class RandomUntilClass {
    public static void main(String[] args) {
        //Math.random()的范围 [0, 1)
        System.out.println(Math.random());

        //每次运行得到的结果是一样的
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); //获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom();  //获取普通的
        }
        byte[] bytes = new byte[16];
        sr.nextBytes(bytes);  // 用安全随机数填充 bytes
        System.out.println(Arrays.toString(bytes));
    }
}
