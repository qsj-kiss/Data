package test;

import com.sort.Insert;

import java.util.Arrays;

/**
 * Create by qsj computer
 *
 * @author qsj
 * @date 2021/4/5 21:01
 */
public class TestInsert {
    public static void main(String[] args) {
        Integer[] min = {10,9,8,7,6,5,4,3,2,1};
        Insert.sort(min);
        System.out.println(Arrays.toString(min));
    }
}
