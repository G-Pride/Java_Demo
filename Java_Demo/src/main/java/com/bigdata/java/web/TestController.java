/**
   guozh
 * 2019年12月2日
 */
package com.bigdata.java.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guozh
 *
 * 创建时间：2019年12月2日 下午4:03:05
 */
@RestController
public class TestController {
	
	@ResponseBody
	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public String hello(String name) {
		return name;
	}

}
