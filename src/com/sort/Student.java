package com.sort;

/**
 * Create by qsj computer
 *
 * @author qsj
 * @date 2021/4/1 17:35
 */
public class Student implements Comparable<Student>{
    private int Id;
    private String name;
    private String remark;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getId()-o.getId();
    }
}
