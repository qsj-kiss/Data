package com.sort;

/**
 * Create by qsj computer
 * 插入算法Api
 * @author qsj
 * @date 2021/4/2 14:58
 */
public class Insert {
    /**对数组进行遍历排序
     * @param c
     */
    public static void sort(Comparable[] c){
        for (int i = 0; i < c.length; i++) {
            for (int j = i; j > 0; j--) {
                if (greater(c[j-1],c[j])){
                    exch(c,j-1,j);
                }else
                    break;
            }
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
