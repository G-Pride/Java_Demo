/**
   guozh
 * 2019年11月27日
 */
package com.bigdata.java.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author guozh
 *
 * 创建时间：2019年11月27日 下午5:31:34
 */
public class FutrueTaskDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask ft = new FutureTask(new MyCallable());
		new Thread(ft).start();
		if(!ft.isDone()) {
			System.out.println("task has not finally");
		}
		System.out.println("task return:"+ft.get());
	}
}
