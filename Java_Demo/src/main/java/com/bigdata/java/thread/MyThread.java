/**
   guozh
 * 2019年11月27日
 */
package com.bigdata.java.thread;

/**
 * @author guozh
 *
 * 创建时间：2019年11月27日 下午3:19:50
 */
public class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("Thread start:"+this.name+i);
		}
	}
}
