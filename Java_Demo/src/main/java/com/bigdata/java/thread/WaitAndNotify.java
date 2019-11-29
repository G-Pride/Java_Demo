/**
   guozh
 * 2019年11月29日
 */
package com.bigdata.java.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author guozh
 *
 *         创建时间：2019年11月29日 上午10:32:36
 */
public class WaitAndNotify {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		for (int i = 0; i < 5; i++) {
			MyNotify t = new MyNotify("Thread" + i, obj);
			t.start();
		}

		try {
			TimeUnit.SECONDS.sleep(2);
			System.out.println("-----Main Thread notify-----");
			synchronized (obj) {
				obj.notify();
			}

			TimeUnit.SECONDS.sleep(2);
			System.out.println("Main Thread is end.");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
