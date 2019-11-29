/**
   guozh
 * 2019年11月27日
 */
package com.bigdata.java.thread;

import java.util.concurrent.Callable;

/**
 * @author guozh
 *
 * 创建时间：2019年11月27日 下午5:18:44
 */
public class MyCallable implements Callable{

	/* (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public Object call() throws Exception {
		String value = "gzh";
		System.out.println("ready to work");
		Thread.currentThread().sleep(5000);
		System.out.println("task done");
		return value;
	}

}
