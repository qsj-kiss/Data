package com.linear;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Qin
 * 定义的一个线性顺序表集合
 * @createDate 2021/4/18 0:19
 * @updateDate 2021/4/18 0:19
 */
public class LinkList<T> implements Iterable<T> {

    /**
     * 设置默认长度
     */
    private static final int DEFAULT_SIZE = 10;

    /**
     * 记录头节点
     */
    private Node head;

    /**
     * 当前线性表的长度
     */
    private int N;

    /**
     * 构造方法
     */
    public LinkList() {
        //初始化头节点
        this.head = new Node(null, null);
        //初始化长度
        this.N = 0;
    }

    /**
     * 清空线性表
     */
    public void clear() {
        this.N = 0;
        head.next = null;
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
        //正确性验证
        if (i>N-1){
          throw new NullPointerException(outMsg(i));
        }
        //通过循环，从头结点开始往后找,依次找i次,就可以找到对应的元素
        Node n = head;
        for (int index = 0; index < i + 1 ; index++) {
            n = n.next;
        }
        return n.item;
    }

    /**
     * 向线性表中的指定位置插入一个值为t的数据
     *
     * @param i
     * @param t
     */
    public void insert(int i, T t) {
        //找到前一个节点
        Node n = head;
        for (int index = 0; index < i - 1; index++) {
            n = n.next;
        }
        //i位置的节点
        Node next = n.next;
        //创建新节点,保存元素T并且节点指向原来i的位置,原来i位置的前一个节点指向新的节点
        n.next = new Node(t, next);
        //元素个数+1
        this.N++;
    }

    /**
     * 向线性表中添加一个数据
     *
     * @param t
     */
    public void insert(T t) {
        //找到最后一个节点
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        //创建新节点,保存元素T
        Node newNode = new Node(t, null);
        n.next = newNode;
        this.N++;
    }

    /**
     * 删除线性表中指定位置的数据
     *
     * @param i
     * @return
     */
    public T remove(int i) {
        Node n = head;
        for (int index = 0; index < i - 1; index++) {
            n = n.next;
        }
        n.next = n.next.next;
        this.N--;
        return n.item;
    }

    /**
     * 返回线性表中首次出现该数据的索引位置未找到返回-1
     *
     * @param t
     * @return
     */
    public int indexOf(T t) {
        Node n = head;
        int i=0;
        while (!(n.next.item).equals(t)){
            n = n.next;
            i++;
        }
        if (i==0){
            return -1;
        }else {
            return i;
        }
    }

    /**
     * 输出提示语设置
     *
     * @param index
     * @return
     */
    private String outMsg(int index) {
        return "当前索引为: " + index + ", 当前集合长度为: " + N;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class Node {
        //存储数据
        T item;
        //下一个节点
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }


    }

    private class ListIterator implements Iterator{
        private Node n;
        public ListIterator(){
            this.n=head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }
}
