package com.yc.option;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @author chungyan
 * @date 2020/6/30 - 9:07
 * 图片复制demo
 */
public class Demo {
    public static void main(String[] args) {
        String path = "d:\\\\demo_test_dir\\test.jpg";
        File file = new File(path);
        if(!file.isDirectory()){
            try {
                FileChannel srcChannel = new FileInputStream(path).getChannel();
                FileChannel dstChannel   =   new FileOutputStream("d:\\\\demo_test_dir\\test1.jpg").getChannel();
                dstChannel.transferFrom(srcChannel,0,srcChannel.size());
                srcChannel.close();
                dstChannel.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
