/**
   guozh
 * 2019年11月28日
 */
package com.bigdata.java.thread;

/**
 * @author guozh
 *interrupt()不能中断在运行中的线程，它只能改变中断状态而已。
 * 创建时间：2019年11月28日 下午8:06:09
 */
public class InterruptionInJava implements Runnable{
    private volatile static boolean on = false;
    public static void main(String[] args) throws InterruptedException {
        Thread testThread = new Thread(new InterruptionInJava(),"InterruptionInJava");
        //start thread,准备开始执行run方法
        testThread.start();
        Thread.sleep(1000);//避免还没执行run方法，就先执行 on = true; 这样while不会执行
        InterruptionInJava.on = true;
        testThread.interrupt();
        System.out.println("main end");
    }
 
    @Override
    public void run() {
        while(!on){
        	try {
				Thread.sleep(10000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("caught exception: "+e);
			}
        }
    }
}