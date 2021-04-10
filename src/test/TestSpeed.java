package test;

import com.sort.Bubble;
import com.sort.Insert;
import com.sort.Selection;
import com.sort.Shell;

import java.io.*;
import java.util.ArrayList;

/**
 * Create by qsj computer
 * 比较速度
 * @author qsj
 * @date 2021/4/10 19:52
 */
public class TestSpeed {
    public static void main(String[] args) throws IOException {
        //创建文件读取流
        //最坏的情况999999-----1倒序
//        BufferedReader fileReader = new BufferedReader(new InputStreamReader(TestSpeed.class.getClassLoader().getResourceAsStream("dic1.txt")));
        //最好的情况1-----999999正序
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(TestSpeed.class.getClassLoader().getResourceAsStream("dic2.txt")));
        //创建一个集合来存储读取出来的数据
        ArrayList<Integer> list = new ArrayList();
        //创建读取流读取数据存入集合
        String line = null;
        while ((line=fileReader.readLine())!=null){
            list.add(Integer.parseInt(line));
        }
        fileReader.close();
        //集合转数组
        Integer [] integers = new Integer[list.size()];
        list.toArray(integers);
        //调用测试代码希尔排序程序执行时间为最坏的情况下22毫秒最好的情况下11毫秒
        //调用测试代码插入排序程序执行时间为最坏的情况下20521毫秒最好的情况下3毫秒
        //调用测试代码冒泡排序程序执行时间为最坏的情况下21857毫秒最好的情况下10170毫秒
        //调用测试代码选择排序程序执行时间为最坏的情况下12928毫秒最好的情况下9048毫秒
//        testSpeed1(integers);
        testSpeed2(integers);
//        testSpeed3(integers);
//        testSpeed4(integers);
    }

    //测试速度希尔排序
    public static void testSpeed1(Integer[] a){
        long start = System.currentTimeMillis();
        Shell.sort(a);
        long begin = System.currentTimeMillis();
        System.out.println("程序执行时间为"+(begin-start)+"毫秒");
    }
    //测试速度插入排序
    public static void testSpeed2(Integer[] a){
        long start = System.currentTimeMillis();
        Insert.sort(a);
        long begin = System.currentTimeMillis();
        System.out.println("程序执行时间为"+(begin-start)+"毫秒");
    }
    //测试速度冒泡排序
    public static void testSpeed3(Integer[] a){
        long start = System.currentTimeMillis();
        Bubble.sort(a);
        long begin = System.currentTimeMillis();
        System.out.println("程序执行时间为"+(begin-start)+"毫秒");
    }
    //测试速度选择排序
    public static void testSpeed4(Integer[] a){
        long start = System.currentTimeMillis();
        Selection.sort(a);
        long begin = System.currentTimeMillis();
        System.out.println("程序执行时间为"+(begin-start)+"毫秒");
    }
}
