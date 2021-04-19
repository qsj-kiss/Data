package com.linear;

import java.util.Iterator;

/**
 * @author Qin
 * @createDate 2021/4/19 22:45
 * @updateDate 2021/4/19 22:45
 */
public class TowWayLinkList<T> implements Iterable {
    /**
     * 记录头节点
     */
    private Node head;
    /**
     * 记录尾节点
     */
    private Node last;

    /**
     * 当前线性表的长度
     */
    private int N;

    /**
     * 构造方法
     */
    public TowWayLinkList() {
        //初始化头节点
        this.head = new Node(null, null, null);
        //初始化尾节点
        this.last = null;
        //初始化长度
        this.N = 0;
    }

    /**
     * 清空线性表
     */
    public void clear() {
        this.N = 0;
        head.next = null;
        last = null;
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
     * 获取第一个元素
     *
     * @return
     */
    public T getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.next.item;
    }

    /**
     * 获取最后一个元素
     *
     * @return
     */
    public T getLast() {
        if (isEmpty()) {
            return null;
        }
        return last.item;
    }

    /**
     * 读取并返回i索引处的数据
     *
     * @param i
     * @return
     */
    public T get(int i) {
        //正确性验证
        if (i > N - 1) {
            throw new NullPointerException(outMsg(i));
        }
        //通过循环，从头结点开始往后找,依次找i次,就可以找到对应的元素
        Node n = head;
        for (int index = 0; index < i + 1; index++) {
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
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        Node curr = n.next;
        //创建新节点,保存元素T并且节点指向原来i的位置,原来i位置的前一个节点指向新的节点
        Node newNode = new Node(t, n, curr);
        n.next = newNode;
        curr.pre = newNode;
        //元素个数+1
        this.N++;
    }

    /**
     * 向线性表中添加一个数据
     *
     * @param t
     */
    public void insert(T t) {
        //如果链表为空
        if (isEmpty()) {
            //创建新的节点
            Node newNode = new Node(t, head, null);
            //新节点成为为节点
            last = newNode;
            //让头结点指向尾节点
            head.next = last;
        } else {
            //如果链表不为空
            //创建新的节点
            Node oldLast = last;
            Node newNode = new Node(t, oldLast, null);
            //当前尾节点指向新节点
            oldLast.next = newNode;
            //让新节点成为尾节点
            last = newNode;
        }
        //个数+1
        this.N++;
    }

    /**
     * 删除线性表中指定位置的数据
     *
     * @param i
     * @return
     */
    public T remove(int i) {
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        //找到当前节点位置
        Node curr = pre.next;
        //找到当前节点的下一个节点
        Node nextNode = curr.next;
        //使当前元素的上一个节点的next指向当前节点的下一个节点
        pre.next =nextNode;
        //使当前元素的上一个节点的pre指向当前节点的上一个节点
        nextNode.pre = pre;
        this.N--;
        return curr.item;
    }

    /**
     * 返回线性表中首次出现该数据的索引位置未找到返回-1
     *
     * @param t
     * @return
     */
    public int indexOf(T t) {
        Node n = head;
        int i = 0;
        while (!(n.next.item).equals(t)) {
            n = n.next;
            i++;
        }
        if (i == 0) {
            return -1;
        } else {
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
    public Iterator iterator() {
        return new TowWayLinkListIterator();
    }


    private class Node {
        //存储数据
        T item;
        //下一个节点
        Node next;
        //上一个节点
        Node pre;

        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }

    private class TowWayLinkListIterator implements Iterator {
        private Node n;

        public TowWayLinkListIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }
}
