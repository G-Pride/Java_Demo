/**
   guozh
 * 2019年11月27日
 */
package com.bigdata.java.thread;

/**
 * @author guozh
 *
 * 创建时间：2019年11月27日 下午3:39:38
 */
public class RunableDemo {
	public static void main(String[] args) {
		System.out.println("调用run方法：");
		MyRunable mr1 = new MyRunable("gzh");
		MyRunable mr2 = new MyRunable("rjy");
		MyRunable mr3 = new MyRunable("r&g");
		//这样只能调用run方法
		mr1.run();
		mr2.run();
		mr3.run();
		
		System.out.println("调用start方法：");
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		Thread t3 = new Thread(mr3);
		t1.start();
		t2.start();
		t3.start();
	}
}
