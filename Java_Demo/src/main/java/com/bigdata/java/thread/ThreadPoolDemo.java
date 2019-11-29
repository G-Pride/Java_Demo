/**
   guozh
 * 2019年11月28日
 */
package com.bigdata.java.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author guozh
 *
 * 创建时间：2019年11月28日 上午10:57:16
 */
public class ThreadPoolDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		Future ft = newCachedThreadPool.submit(new MyCallable());
		if(!ft.isDone()) {
			System.out.println("task has not finally");
		}
		System.out.println("task return:"+ft.get());
	}
}
