package com.sort;

/**
 * Create by qsj computer
 * 选择排序API
 * @author qsj
 * @date 2021/4/2 15:51
 */
public class Selection {
    /**对数组进行遍历排序
     * @param c
     */
    public static void sort(Comparable[] c){
        int count = 0;
        for (int i = 0; i < c.length - 2; i++) {
            int minIndex = i;
            for (int j = i+1 ; j < c.length; j++) {
                    count++;
                if (greater(c[minIndex],c[j])){
                    minIndex=j;
                }
            }
            exch(c,i,minIndex);
        }
        System.out.println(count);
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
