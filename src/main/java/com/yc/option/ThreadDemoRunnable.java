package com.yc.option;

/**
 * @author chungyan
 * @date 2020/6/30 - 11:53
 */
public class ThreadDemoRunnable implements Runnable{

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"ing");
        }
    }
}
