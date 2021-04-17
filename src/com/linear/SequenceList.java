package com.linear;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Qin
 * 定义的一个线性顺序表集合
 * @createDate 2021/4/18 0:19
 * @updateDate 2021/4/18 0:19
 */
public class SequenceList<T> implements Iterable<T> {

    /**
     * 设置默认长度
     */
    private static final int DEFAULT_SIZE = 10;

    /**
     * 存储数据的数组
     */
    private T[] arr;

    /**
     * 当前线性表的长度
     */
    private int N;

    /**
     * 定义长度的构造方法
     * @param capacity
     */
    public SequenceList(int capacity) {
        capacity=Math.max(capacity,DEFAULT_SIZE);
        //初始化数组
        this.arr = (T[]) new Object[capacity];
        //初始化长度
        this.N = 0;
    }

    /**
     * 不定义长度的构造方法
     */
    public SequenceList() {
        this.arr = (T[]) new Object[DEFAULT_SIZE];
        //初始化长度
        this.N = 0;
    }

    /**
     * 清空线性表
     */
    public void clear() {
        this.N = 0;
        for (int i = 0;i<arr.length;i--){
            arr[i] = null;
        }
    }

    /**
     * 判断是否为空为空返回true
     *
     * @return
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 返回线性表的长度
     *
     * @return
     */
    public int size() {
        return this.N;
    }

    /**
     * 读取并返回i索引处的数据
     *
     * @param i
     * @return
     */
    public T get(int i) {
        //检测是否出错
        check(i);
        return arr[i];
    }

    /**
     * 向线性表中的指定位置插入一个值为t的数据
     *
     * @param i
     * @param t
     */
    public void insert(int i, T t) {
        //检测是否出错
        check(i);
        //进行扩容判断
        IsExpansion();
        //先把i元素的数据及其后面的元素索引全部后移一位
        for (int index = N; index > i; index--) {
            arr[index] = arr[index - 1];
        }
        this.N++;
        arr[i] = t;
    }

    /**
     * 向线性表中添加一个数据
     *
     * @param t
     */
    public void insert(T t) {
        //进行扩容判断
        IsExpansion();
        //追加一个元素在数组末端
        arr[N++] = t;
    }

    /**
     * 删除线性表中指定位置的数据
     *
     * @param i
     * @return
     */
    public T remove(int i) {
        //检测是否出错
        check(i);
        //运行减容机制
        IsShrink();
        //记录索引i处的值
        T current = arr[i];
        //索引i后面元素依次向前移动一位即可
        for (int index = i; index < N - 1; index++) {
            arr[index] = arr[index + 1];
        }
        //设置删除位置的值为空
        this.arr[i] = null;
        //元素个数-1
        this.N--;
        return current;
    }

    /**
     * 返回线性表中首次出现该数据的索引位置未找到返回-1
     *
     * @param t
     * @return
     */
    public int indexOf(T t) {
        for (int i = 0; i < N; i++) {
            if (arr[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }


    /**
     *扩容判断方法
     */
    private void IsExpansion(){
        if (N==arr.length){
            resize(Math.max(N * 2, DEFAULT_SIZE));
        }
    }

    /**
     * 缩容判断方法
     */
    private void IsShrink(){
        if (N<=arr.length/4){
            if (N>=10){
            resize(Math.max(arr.length / 2, DEFAULT_SIZE));
            }
        }
    }

    /**
     * 根据参数newSize重置arr的大小,扩容配合缩容机制
     * @param newSize
     */
    private void resize(int newSize) {

        //定义一个临时数组指向原数据
        T[] temp = arr;
        //创建新数组
        arr = (T[]) new Object[newSize];
        //把原数组的数据拷贝到新数组中
        arr = Arrays.copyOf(temp, newSize);
        //原始方法
//        for (int i = 0; i < N; i++) {
//            arr[i] = temp[i];
//        }

    }

    /**
     * 检测数据是否异常
     */
    private void check(int index){
        if (index>=N){
        throw new IndexOutOfBoundsException(outMsg(index));
        }
    }

    /**
     * 输出提示语设置
     * @param index
     * @return
     */
    private String outMsg(int index) {
        return "当前索引为: "+index+", 当前集合长度为: "+N;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator {
        private int index;

        public SIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < N;
        }

        @Override
        public Object next() {
            return arr[index++];
        }
    }
}
