package test;

import com.linear.LinkList;

/**
 * @author Qin
 * 测试线性链表集合
 * @createDate 2021/4/18 23:38
 * @updateDate 2021/4/18 23:38
 */
public class LinkListTest {
    public static void main(String[] args) {
        LinkList<String> list = new LinkList<>();
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
        list.insert("张三");
        list.insert("李四");
        list.insert("王五");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
