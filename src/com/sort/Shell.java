package com.sort;

/**
 * Create by qsj computer
 * 希尔排序算法Api
 * @author qsj
 * @date 2021/4/2 14:58
 */
public class Shell {
    /**对数组进行遍历排序
     * @param c
     */
    public static void sort(Comparable[] c){
        //1.根据数组长度，确定增长量
        int h = 1;
        while (h<c.length/2){
            h = 2 * h + 1;
        }
        while (h>=1){
            //排序
            //2.1找到待插入的元素
            for (int i = h; i < c.length ; i++) {
            //2.2把待插入的元素插入到有序列中
                for (int j = i; j >= h; j -= h){
                    //待插入的元素是c[j],比较a[j]和a[j-h]
                    if (greater(c[j-h],c[j])){
                        //交换元素
                        exch(c,j-h,j);
                    }else {
                        //待插入元素已经找到了合适的位置,结束循环
                        break;
                    }
                }

            }
            //减小h的值
            h = h / 2;
        }
    }

    /** 比较V元素是否大于w元素
     * @param v
     * @param w
     * @return
     */
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    public static void exch(Comparable[] a, int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
