/**
   guozh
 * 2019年11月29日
 */
package com.bigdata.java.thread;

/**
 * @author guozh
 *
 *         创建时间：2019年11月29日 上午10:12:59
 */
public class MyNotify extends Thread {

	private String name;
	private Object obj;

	public MyNotify(String name, Object obj) {
		this.name = name;
		this.obj = obj;
	}

	public void run() {
		System.out.println(name + " is waiting.");

		try {
			synchronized (obj) {
				obj.wait();
				System.out.println(name + " is wait.");
			}
			System.out.println(name + " has been notified.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
