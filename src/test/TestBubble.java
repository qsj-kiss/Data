package test;


import com.sort.Bubble;

import java.util.Arrays;

/**
 * Create by qsj computer
 * 冒泡排序
 *
 * @author qsj
 * @date 2021/4/2 13:08
 */
public class TestBubble {

    public static void main(String[] args) {
        Integer[] max = {1,2,3,4,5,6,7,8,9,10};
        Integer[] min = {10,9,8,7,6,5,4,3,2,1};
//        Integer[] a = {95,65,18,1,52,64,72,55,32,5,3};
        Bubble.sort(min);
        System.out.println(Arrays.toString(max));
    }
}
