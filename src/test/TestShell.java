package test;


import com.sort.Bubble;
import com.sort.Shell;

import java.util.Arrays;

/**
 * Create by qsj computer
 * 希尔排序
 * @author qsj
 * @date 2021/4/2 13:08
 */
public class TestShell {

    public static void main(String[] args) {
        Integer[] max = {1,2,3,4,5,6,6,7,8,9,10};
        Integer[] min = {10,9,8,7,6,5,4,6,3,2,1};
        Shell.sort(max);
        System.out.println(Arrays.toString(max));
    }
}
