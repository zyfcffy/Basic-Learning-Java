package basic.collections;

import java.util.Deque;
import java.util.LinkedList;

/*
* Queue 先进先出，一头进一头出
* Deque：Double End Queue，双端队列
*   既可以添加在队尾，也能添加在队首
*   既可以从队首获取，又可以从队尾获取
*   addLast(E e) / offerLast(E e) / addFirst(E e) / offerFirst(E e)
*   E removeFirst() / E pollFirst() / E removeLast() / E pollLast()
*   E getFirst() / E peekFirst() / E getLast() / E peekLast()
* 尽量避免把 null 添加到队列
* 调用xxxLast()以区别Queue
* */
public class DequeDemo {
  public static void main(String[] args) {

    // 面向抽象，尽量持有接口，而不是具体实现类
    Deque<String> deque = new LinkedList<>();
    deque.offerLast("A"); //A
    deque.offerLast("B"); //A <- B
    deque.offerFirst("C"); //C <- A <- B

    System.out.println(deque.peekFirst()); // C
    System.out.println(deque.pollLast());  // B
    System.out.println(deque.pollLast()); // A
    System.out.println(deque.pollLast()); // C
    System.out.println(deque.pollLast()); // null

  }
}
