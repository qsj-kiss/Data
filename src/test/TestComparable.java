package test;

import com.sort.Student;

/**
 * Create by qsj computer
 * 定义测试类Test，在测试类Test中定义测试方法comparable getMax（comparable c1，Comparable c2）完成测试
 * @author qsj
 * @date 2021/4/2 13:08
 */
public class TestComparable {

    public static void main(String[] args) {
        Student c1 = new Student();
        Student c2 = new Student();
        c1.setId(18);
        c1.setName("张三");
        c1.setRemark("我是张三我最帅");

        c2.setId(19);
        c2.setName("李四");
        c2.setRemark("我李四才是最帅的");
        Comparable max = getMax(c1, c2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        if (result>=0){
            return c1;
        }else {
            return c2;
        }
//        switch (result){
//            case 0:
//                System.out.println("c1和c2一样大");
//                break;
//            if (result>0){
//                System.out.println("c1比c2大");
//                break;
//            }else {
//                System.out.println("c2比c1大");
//                break;
//            }
//        }
    }
}
