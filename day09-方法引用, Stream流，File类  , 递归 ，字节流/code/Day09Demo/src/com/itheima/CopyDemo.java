package com.itheima;

import java.io.*;

/**
 * ----------------------------------------------------------------------
 * @author Create by liuwen at  2020/10/11 12:39
 * <p>
 * ----------------------------------------------------------------------
 **/
public class CopyDemo {
    private static final String SRC = "E:\\百度网盘\\cloud\\pom文件+脑图\\pom依赖.md";
    private static final String OBJ = "E:\\百度网盘\\";

    public static void main(String[] args) {
        copy01();
        copy02();
        copy03();
        copy04();
    }

    private static void copy01() {
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC);
                OutputStream os = new FileOutputStream(OBJ+"01.md");
        ) {
            int len;
            while ((len = is.read()) != -1) {
                os.write(len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("copy01耗时："+(end-start)/1000.0);
    }

    private static void copy02() {
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC);
                OutputStream os = new FileOutputStream(OBJ+"02.md");
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("copy01耗时："+(end-start)/1000.0);
    }

    private static void copy03() {
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC);
                BufferedInputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(OBJ+"03.md");
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ) {
            int len;
            while ((len = bis.read()) != -1) {
                bos.write(len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("copy03耗时："+(end-start)/1000.0);
    }

    private static void copy04() {

    }

}
