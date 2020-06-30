package com.yc.option;

/**
 * @author chungyan
 * @date 2020/6/30 - 11:15
 *  线程的基本操作体验
 */
public class ThreadDemo {
    public static void main(String[] args) {
        ThreadDemoRunnable t1 = new ThreadDemoRunnable("aaaaaa");
        ThreadDemoRunnable t2 = new ThreadDemoRunnable("bbbbbb");
        ThreadDemoRunnable t3 = new ThreadDemoRunnable("cccccc");
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }


}
