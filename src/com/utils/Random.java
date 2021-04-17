package com.utils;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Create by qsj computer
 * 创建随机数的方法
 * @author qsj
 * @date 2021/4/10 19:57
 */
public class Random {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("dic2.txt");
//        for (int i = 100000 ; i >=1 ; i--){
        for (int i = 0 ; i <=100000 ; i++){
            fileWriter.write(String.valueOf(i));
            fileWriter.write("\r");
            fileWriter.flush();
        }
        fileWriter.close();
    }
}
