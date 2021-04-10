package test;

/**
 * Create by qsj computer
 * 计算一百个1*100+···+100*100的和
 *
 * @author qsj
 * @date 2021/4/1 12:54
 */
public class TestSum {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = ints.length;
        int temp;
        for (int start = 0, end = n - 1; start <= end; start++, end--) {
                temp=ints[start];
                ints[start]=ints[end];
                ints[end]=temp;
        }
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static void Test1() {
        long begin = System.currentTimeMillis();
        int n = 1;
        int m = 100;
        int sum;
        sum = (n + m) * m / 2 * 100;
        System.out.println("结果为" + sum);
        long end = System.currentTimeMillis();
        System.out.println("总耗时" + (end - begin) + "毫秒");
    }

}
