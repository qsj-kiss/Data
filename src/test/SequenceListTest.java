package test;

import com.linear.SequenceList;

import java.util.ArrayList;

/**
 * @author Qin
 * @createDate 2021/4/18 1:11
 * @updateDate 2021/4/18 1:11
 */
public class SequenceListTest {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList<String> list = new SequenceList<>();
        //测试插入
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        list.insert("美迪");
        //测试获取
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.remove(0);
        }
        //测试获取
//        for (int i = 0 ;i<list.length();i++ ){
//            System.out.println(list.get(i));
//        }
//        //测试删除
//        System.out.println("--------------");
//        System.out.println("当前长度为"+list.size());
//        String remove = list.remove(3);
//        String s = list.get(3);
//        System.out.println(s);
//        System.out.println(remove);
//        System.out.println("删除后当前长度为"+list.size());
//        //测试清空
//        list.clear();
//        System.out.println("--------------");
//        System.out.println("当前长度为"+list.size());
//        System.out.println(list.isEmpty());
//        System.out.println(list.get(0));
    }
}
