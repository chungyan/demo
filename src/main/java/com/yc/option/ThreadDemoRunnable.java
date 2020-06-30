package com.yc.option;

/**
 * @author chungyan
 * @date 2020/6/30 - 11:53
 */
public class ThreadDemoRunnable implements Runnable{

    private String threadName;


    public ThreadDemoRunnable(String name) {
        this.threadName = name;
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(threadName+"------线程");
        }
    }
}
