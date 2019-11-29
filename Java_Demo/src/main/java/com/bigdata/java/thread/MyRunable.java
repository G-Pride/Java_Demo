/**
   guozh
 * 2019年11月27日
 */
package com.bigdata.java.thread;

/**
 * @author guozh
 *
 * 创建时间：2019年11月27日 下午3:36:51
 */
public class MyRunable implements Runnable{

	private String name;
	public MyRunable(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++) {
			System.out.println("Thread start:"+this.name+i);
		}
	}
}
