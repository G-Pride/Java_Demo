/**
   guozh
 * 2019年12月2日
 */
package com.bigdata.java.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bigdata.java.ioc.model.Person;

/**
 * @author guozh
 *
 * 创建时间：2019年12月2日 下午2:06:31
 */
@Configuration
public class ApplicationContext {
	@Bean(name="person")
	public Person initPerson() {
		Person person = new Person();
		person.setId(1);
		person.setName("Jack");
		return person;
	}
}
