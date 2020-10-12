package com.itheima;

import java.nio.IntBuffer;
import java.util.Random;

public class NioBasic {
    public static void main(String[] args) {
        //指定buffer长度
        IntBuffer buffer = IntBuffer.allocate(5);
        Random random1 = new Random();
        //加入随机数
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(random1.nextInt(1000));
        }
        //将buffer转换一下，读写切换
        buffer.flip();
        //读取
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());

        }
    }
}
