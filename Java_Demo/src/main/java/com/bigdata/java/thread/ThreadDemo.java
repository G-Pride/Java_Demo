/**
   guozh
 * 2019年11月27日
 */
package com.bigdata.java.thread;

/**
 * @author guozh
 *
 * 创建时间：2019年11月27日 下午3:29:42
 */
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("gzh");
		MyThread mt2 = new MyThread("rjy");
		MyThread mt3 = new MyThread("r&g");
		System.out.println("调用run方法：");
		mt1.run();
		mt2.run();
		mt3.run();
		System.out.println("调用start方法：");
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
