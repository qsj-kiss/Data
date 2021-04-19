package test;

import com.linear.TowWayLinkList;

/**
 * @author Qin
 * 测试线性链表集合(双向)
 * @createDate 2021/4/18 23:38
 * @updateDate 2021/4/18 23:38
 */
public class TowWayLinkListTest {
    public static void main(String[] args) {
        TowWayLinkList<String> list = new TowWayLinkList<>();
        System.out.println("----------");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("----------");
        list.insert("张三");
        list.insert("李四");
        list.insert("王五");
        System.out.println(list.get(2));
        System.out.println(list.indexOf("王五"));
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));
        System.out.println(list.size());
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println("----------");
        list.insert("张三");
        list.insert("李四");
        list.insert("王五");
        System.out.println(list.remove(1));
        System.out.println("----------");
        list.insert(0,"666");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("----------");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
