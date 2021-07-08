package basic.collections;

import basic.collections.pojo.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    List<Message> received = new ArrayList<>();
    received.add(new Message(1, "Hello!"));
    received.add(new Message(2, "发工资了吗？"));
    received.add(new Message(2, "发工资了吗？"));
    received.add(new Message(3, "去哪吃饭？"));
    received.add(new Message(3, "去哪吃饭？"));
    received.add(new Message(4, "Bye"));
    List<Message> displayMessages = process(received);
    for (Message message : displayMessages) {
      System.out.println(message.text);
    }
  }

  static List<Message> process(List<Message> received) {
    // 按sequence去除重复消息
    TreeSet<Message> messageTreeSet = new TreeSet<>((m1, m2) -> {
      if (m1.sequence == m2.sequence) {
        return 0;
      }
      return m1.sequence > m2.sequence ? 1 : -1;
    });
    messageTreeSet.addAll(received);
    return new ArrayList<>(messageTreeSet);
  }
}

