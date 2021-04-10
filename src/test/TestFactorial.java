package test;

/**
 * Create by qsj computer
 * 递归运算（递归次数不能太多否则栈内存溢出)
 * @author qsj
 * @date 2021/4/10 20:55
 */
public class TestFactorial {
    public static void main(String[] args) {
        long factorial = factorial(5);
        System.out.println(factorial);
    }
    public static long factorial(long i){
        if (i==1){
            return 1;
        }
        return i*factorial(i-1);
    }
}
