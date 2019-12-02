/**
   guozh
 * 2019年12月2日
 */
package com.bigdata.java.ioc.model;

import org.springframework.stereotype.Component;

/**
 * @author guozh
 *
 * 创建时间：2019年12月2日 下午2:05:45
 */
@Component("person")
public class Person {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
