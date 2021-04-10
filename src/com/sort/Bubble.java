package com.sort;

/**
 * Create by qsj computer
 * 排序算法Api
 * @author qsj
 * @date 2021/4/2 14:58
 */
public class Bubble {
    /**对数组进行遍历排序
     * @param c
     */
    public static void sort(Comparable[] c){
        int count = 0;
        for (int length = c.length - 1; length > 0; length--) {
            for (int j=0;j<length;j++){
                count ++;
                if (greater(c[j],c[j+1])){
                    exch(c,j,j+1);
                }
            }
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
