/**
   guozh
 * 2019年11月28日
 */
package com.bigdata.java.thread;

/**
 * @author guozh
 *
 * 创建时间：2019年11月28日 下午3:39:47
 */
public class YieldDemo {
	
	public static void main(String[] args) {
		Runnable yield = new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println(Thread.currentThread().getName()+i);
					if(i==5) {
						Thread.yield();
					}
				}
				
			}
			
		};
		Thread t1 = new Thread(yield,"A");
		Thread t2 = new Thread(yield,"B");
		Thread t3 = new Thread(yield,"C");
		t1.start();
		t2.start();
		t3.start();
	}
}
