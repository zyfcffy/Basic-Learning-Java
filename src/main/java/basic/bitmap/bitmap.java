package basic.bitmap;

import java.util.BitSet;

public class bitmap {

    public static void main(String[] args) {
        //位计算
//        int num = 10;
//        System.out.println(num);
//        System.out.println(num << 1);
//        System.out.println(num << 2);
//        System.out.println(Integer.toBinaryString(num));
//        System.out.println(Integer.toBinaryString(num << 1));
//        System.out.println(Integer.toBinaryString(num << 2));
//        int num2 = 10;
//        System.out.println(Integer.toBinaryString(num2 >>> 1));
//        System.out.println(10 >>> 1);
//        System.out.println(Integer.toBinaryString(num2 >> 1));
//        System.out.println(num2 >> 1);
//        System.out.println(Integer.toBinaryString(1 << 6));
//        System.out.println(1 << 31);

        //BitSet()
//        BitSet bitSet = new BitSet();
//        bitSet.set(0);
//        bitSet.set(2,7);
//        bitSet.set(66);
//        System.out.println(bitSet.toString());      //存的是哪几位是true的 {0, 2, 3, 4, 5, 6, 66}
//        System.out.println(bitSet.size());          //size是自动扩容，以64位倍数增加 128
//        System.out.println(bitSet.length());        //length logic size是最高位是true的索引+1 67
//        System.out.println(bitSet.isEmpty());
//        System.out.println(bitSet.cardinality());   //bitset里是true的个数  7

        BitSet bitSet1 = new BitSet();
        BitSet bitSet2 = new BitSet();
        bitSet1.set(0);
        bitSet1.set(2);
        bitSet1.set(4);
        bitSet1.set(5);
        bitSet2.set(0);
        bitSet2.set(2);
        bitSet2.set(3);
        //bitSet1.andNot(bitSet2);      // andNot()  left anti join
        bitSet1.xor(bitSet2);
        System.out.println(bitSet1);
    }
}
